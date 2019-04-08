//Main-metode
class Oblig6{
  public static void main(String[] args)throws Exception{
    //Oppretter et nytt objekt
    OrdListe liste = new OrdListe();
    //Kaller på metode lesbok som skal gå gjennom filen min scarlet
    liste.lesBok("scarlet.txt");
//Oppgave A
  //AntallOrd - utskrift
  if (liste.antallOrd() > 0) {
    System.out.println("Antall ord i ordliste: " + liste.antallOrd());
  } else{
    System.out.println("ordet finnes ikke");
  }

//Oppgave B
  //ANTALLFOREKOMSTER - utskrift
  System.out.println("Ordet Watson" + liste.antallForekomster("Watson"));

//Oppgave C
  //ANTALLFOREKOMSTER - utskrift
  System.out.println("Ordet elementary" + liste.antallForekomster("elementary"));

//Oppgave D
  //5 VANLIGSTE - utskrift
  System.out.println("De 5 vanligste ordene i ordliste: ");
  Ord[] array = liste.vanligste5();
  for(int i = 0; i < 5; i++){
    System.out.println("-" + array[i].toString());
  }

//Oppgave E
  //LENGSTE - utskrift
  System.out.println("Lengste ordet er:" + liste.finnLengste());

//Oppgave F
  //KORTESTE - utskrift
  System.out.println("Korteste ordet er: " + liste.finnKorteste());

//Oppgave G
  //PLASSIDOUMENTET - utskrift
  Ord mestPlass = liste.tarMestPlassIDokument();
  System.out.println("Tar mest plass i dokumentet:" + mestPlass.toString());

  }
}
