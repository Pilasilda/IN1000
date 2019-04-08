class Oppgave51{
public static void main(String[] args){
  Bil opel = new Bil(50, 0.1);

  //Kaller på metoden kjorTur fra klassen bil og sier at jeg skal kjore 600km
  boolean drive = opel.kjorTur(200);

  //if-test for å sjekke om bilen kan kjore 200km
  if(drive == false){
    System.out.println("Du maa fulle bensin. ");
  }else{
    System.out.println("Bile har kjort " + opel.hentKilometerstand());
    System.out.println("Bilen kan kjore " + opel.hentMaksDistanse() + "km. ");
  }
}
}
