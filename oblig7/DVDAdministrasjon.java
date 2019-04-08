import java.util.HashMap; //Importerer hashmap
import java.util.Scanner; //Importerer scanner
import java.io.File; //Import for aa lese fil

//Klassen DVDAdministrasjon
public class DVDAdministrasjon{
  //Opretter et hashmap som inneholder alle navn
  private HashMap <String, Person> navneListe = new HashMap<String, Person>();
  Scanner scan = new Scanner(System.in);
  private String navn;
  private String linje;

  //Metode for som returerer den private hashmap-en
  public HashMap<String, Person> getnavneListe(){
    return navneListe;
  }

  //Metode som lesefil og legger objekt i hashmap
  public void lesInn(String filnavn) throws Exception{
    Scanner fil = new Scanner(new File(filnavn));//lager ett nytt scannerobjekt
    linje = fil.nextLine();
    //Leser inn navn og legger navn i hashmap
    while(fil.hasNextLine()){
      while(!linje.equals("-")){
          navneListe.put(linje, new Person(linje)); //legger til i navneliste hashmap
          //Leser linje
          linje = fil.nextLine();
      }
      //Leser linje
      linje = fil.nextLine();
      //Henter personer lagret i hashmap
      Person p = navneListe.get(linje);
      while(!linje.equals("-")){
        //Hvis linje inneholder tegnet *
        if(linje.charAt(0) == '*'){
          String bruh = linje.substring(1);
          DVD dtmb = new DVD(bruh, p); //legg til ny DVD
          p.leggTilDVD(dtmb);//Legger til i personens eierarkiv
          linje = fil.nextLine(); //leser linje
          Person laaner = navneListe.get(linje); //henter personer
          laaner.getLaanere().put(bruh, dtmb); //legger laante DVD i lanere hashmaps
          p.getUtlaanere().put(bruh, dtmb); // maa legge til person som laaner dvden
        }else{
          DVD dtmb = new DVD(linje, p); //Legger til ny DVD
          p.leggTilDVD(dtmb);//
        }
        linje = fil.nextLine();//Leser linje
      }
    }
  }

  //Metode for meny som viser overiskt over hva bruker kan velge
  public void meny(){
      System.out.println(" ");
      System.out.println("*******DVDAdministrasjon*******");
      System.out.println("1 : nyPerson ");
      System.out.println("2 : kjop ");
      System.out.println("3 : laan ");
      System.out.println("4 : visPerson");
      System.out.println("5 : visOversikt");
      System.out.println("6 : retur");
      System.out.println("7 : avslutt ");
      System.out.println(" ");
      System.out.println("***");
      System.out.println(" ");
      System.out.println("Gi en kommando ved aa skrive ett tall");
}
  //Ordrelokke som skal gå gjennom alle metodene
  public void ordrelokke(){
    int valg = Integer.parseInt(scan.nextLine());
    while(valg != 7){
    if(valg == 1){
      nyPerson();
    }else if(valg == 2){
      kjop();
    }else if(valg == 3){
      laan();
    }else if(valg == 4){
      visPersoner();
    }else if(valg == 5){
      visOversikt();
    }else if(valg == 6){
      retur();
    }else{
      //Hvis bruker taster 7 gå gis denne utksriften
      System.out.println("Ugyldig kommando!!!! Vennligst oppgi et lovlig kommando.");
    }
    meny();
    valg = Integer.parseInt(scan.nextLine());
 }
}

  //Metode for å opprette ny person som legges i navneListe hashmapet
  public void nyPerson(){
    //Skriver til terminal
    System.out.println("Legg til ny person: ");
    //Input fra bruker
    String navn = scan.nextLine();
    //Oppretter et personobjekt og legger til den nye personen i HashMapen ved navn navneListe
    navneListe.put(navn, new Person(navn));
}

  //Metode som viser oversikt over hva en spesifikk person eier
  public void visPersoner(){
    System.out.println("Hvilken person vil du se? (* for alle)");
    String tekst = scan.nextLine();
    if(tekst.equals("*")){
      for(Person p : navneListe.values()){
        p.utskrift();
      }
    } else{
      navneListe.get(tekst).utskrift();
    }
  }

  //Metode som viser oversikt over alle personene i arkivet
  public void visOversikt(){
    for(Person p : navneListe.values()){
      System.out.println("Person: " + p.toString()); //Henter person sitt navn
      System.out.println("Eier: " + p.getEier().size()); //antall eide
      System.out.println("Laant: " + p.getLaanere().size()); //antall laante
      System.out.println("Utlaant: " + p.getUtlaanere().size()); //antall utlaant
      System.out.println(" ");
    }
  }

  //Metode for aa gjore et kjop
  public void kjop(){
    System.out.println("Hva heter eieren? "); //Kommando til terminal
    String navn = scan.nextLine();
    if(navneListe.containsKey(navn)) {
      System.out.println("Personen finnes i systemet"); //Kommando til terminal
    }else {
      System.out.println("Personen finnes ikke i systemet");//Kommando til terminal
      return;
    }
    System.out.println("Hva er tittelen paa DVD-en? "); //KOmmando til terminal
    String tittel = scan.nextLine();
    Person kjoper = navneListe.get(navn);
    kjoper.getEier().put(tittel, new DVD(tittel, kjoper));
    HashMap<String, DVD> temp = kjoper.getEier();//Kjopet legges i en temprary HashMap
}

  //Metode for å gjore et laa
  public void laan(){
    //Sjekker om hvem som laaner DVD-en
    System.out.println("Hvem vil laane DVD-en?"); //Kommando til terminal
    String laan = scan.nextLine();
    if(!navneListe.containsKey(laan)) {
      System.out.println("Personen finnes ikke i systemet");
      return;
    }

    //Sjekker om hvem som utlaant dvd-en
    System.out.println("Hvem skal laane bort DVD-en?"); //Kommando til terminal
    String utlaan = scan.nextLine();
    if(!navneListe.containsKey(utlaan)) {
      System.out.println("Utlaaneren finnes ikke i systemet");
      return;
    }

    //Sjekker om hva tittel på dvd-en som laanes ut er
    System.out.println("Hvilken DVD skal laanes?");
    String dvd = scan.nextLine();
    if(!navneListe.get(utlaan).getEier().containsKey(dvd)) {
      System.out.println("DVDen finnes ikke i systemet");
      return;
    }

    Person utLaaner = navneListe.get(utlaan);
    DVD dvden = utLaaner.getEier().get(dvd);
    Person laaner = navneListe.get(laan);
    utLaaner.getUtlaanere().put(dvd, dvden);
    dvden.settLaaner(laaner);
    laaner.getLaanere().put(dvd, dvden);

  }

  //Metode for å retunrere DVD
  public void retur(){
    System.out.println("Hvem har laant DVD-en? ");
    String returNavn = scan.nextLine();
    if(navneListe.get(returNavn).getLaanere().size() == 0){
      System.out.println("Person laaner ikke DVD fra noen. ");
      return;
    }

    System.out.println("Hva er navnet til eieren ? ");
    String eierNavn = scan.nextLine();
    if(navneListe.get(eierNavn).getUtlaanere().size() == 0){
      System.out.println("Personen utlaaner ikke DVD-er til noen. ");
      return;
    }

    System.out.println("Hvilken DVD skal personen returnere? ");
    String returDVD = scan.nextLine();
    if(!navneListe.get(returNavn).getLaanere().containsKey(returDVD)){
      System.out.println("Personen har ikke laant en saan DVD. ");
      return;
    }
    Person laaner = navneListe.get(returNavn); //Henter personer i hashmap til den som DVD skal returneres til
    Person utlaante = navneListe.get(eierNavn); //Henter person i hashmap til person som eier DVD
    laaner.getLaanere().remove(returDVD); //Fjerner laante DVD fra hashmap
    utlaante.getUtlaanere().remove(returDVD); //Fjerner utlaante DVD fra hashmap
  }
}
