//Test-main klasse for 6.2
class Oppgave62{
public static void main(String[] args) throws Exception{
  //ord objekt
  OrdListe liste = new OrdListe();
  //Leser fil
  liste.lesBok("winnie.txt");
//Finner ord
  if (liste.finnOrd("is") == null) {
  System.out.println("Ordet finnes ikke i filen!");
} else {
  System.out.println("Ordet is finnes i filen!");
}
//Antallord
if (liste.antallOrd() > 0) {
  System.out.println("Antall ord i ordliste: " + liste.antallOrd());
} else{
  System.out.println("ordet finnes ikke");
}

//ANTALLFOREKOMSTER
  System.out.println("Ordet heeey forekommer:" + liste.antallForekomster("heeey"));

//5 VANLGISTE
System.out.println("De 5 vanligste ordene er:");
hey.vanligste5();
 Ord[] vanligste = liste.vanligste5();

 for (int i = 0; i < 5; i++){
    System.out.println("-" + vanligste[i]);
  }
//lengste
 System.out.println("Lengste ordet er:" + liste.finnLengste());
//Korteste
 System.out.println("Korteste ordet er: " + liste.finnKorteste());

  //tarMestPlassIDokument():
  Ord mestPlass = liste.tarMestPlassIDokument();
 System.out.println("Tar mest plass i dokumentet:" + mestPlass.toString());
}
}
