//importerer HashMap
import java.util.HashMap;
//Klassen person
public class Person{
  //Variabel
  private String navn;
  //3 HashMap-er for eier, utlaaner og laaner
  private HashMap <String, DVD> eier = new HashMap<String, DVD>();
  private HashMap <String, DVD> utlaanere = new HashMap<String, DVD>();
  private HashMap <String, DVD> laanere = new HashMap<String, DVD>();

  //Metode som returnerer hashmap for eier
  public HashMap<String, DVD> getEier(){
    return eier;
  }
  //Metode som returnerer hashmap for utlanere
  public HashMap<String, DVD> getUtlaanere(){
    return utlaanere;
  }
  //Metode som returnerer hashmap laanere
  public HashMap<String, DVD> getLaanere(){
    return laanere;
  }

  //Konstruktor for person med navn
  public Person(String navn){
    this.navn = navn;
  }

  //Legger til ny-dvd
  public void leggTilDVD(DVD dvd){
    eier.put(dvd.HentTittel(), dvd);
  }

  //toString metode
  public String toString(){
    return navn;
  }

  //Utskrift for oversikt over personer
  public void utskrift(){
    //Sjekker hva hvilke dvd-er personen eier
    System.out.println("Person: " + navn);
    if(eier.size() == 0){
      System.out.println(navn + " eier ingen DVD-er.");
    } else{
      for(DVD d: eier.values()){
        System.out.println(navn + " eier " + d.HentTittel() + ".");
      }
    }
    //Sjekker hvilke Dvd-er utlaaneren utlaaner
    if(utlaanere.size()==0){
      System.out.println(navn + " laaner ikke bort noen DVD-er.");
    } else{
      for(DVD d: utlaanere.values()){
        System.out.println(navn + " laaner bort " + d.HentTittel() + ".");
      }
    }
    //Sjekker hva laaneren laaner
    if(laanere.size()==0){
      System.out.println(navn + " laaner ikke DVD-er fra noen.");
    } else{
      System.out.println("DVD-er " + navn + " laaner:");
      for(DVD d: laanere.values()){
        System.out.println(d.HentTittel() + " er laant fra " + d.HentEier().toString());
      }
    }


  }
}
