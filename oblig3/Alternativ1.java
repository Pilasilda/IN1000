 /* Dette er oppgave 3.4 Alternativ1.*/
import java.util.Scanner;

public class Alternativ1{
  public static void main(String[] args){
    int antall = 0;
    //oppretter nytt scanner objekt
    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv inn ønsket tall");
    //Hente ut input fra bruker
    String input = scan.nextLine();
    //Konvertere fra string til int
    antall = Integer.parseInt(input);
    //Kaller på metode som er laget under
    skrivTekster(input,antall);
  }
  /* 3.4 b)Tenkte først at jeg ville laget en if-test som sier at for hver gang teller > 3 så skal det skrives ut en tom System.out.println("");
     Prøvde først dette, men det fungerte ikke, men etter seminargruppetimen så fikk vi vite at det var mulig å bruke %(modulo). Dette
     er noe som deler et tall og gir restverdi av det delte utrykket. Så det er vel bare å kombinere det jeg antok først altså en if-test
     med modulo. Noe lignende som at if(tall%3==0), så skal det skrives ut en tom streng som nevnt tidligere: System.out.println(" ");.*/
  //Metode for å skrive ut tekst med mellom hver 3 gang
  public static void skrivTekster(String tekst, int antall){
    int teller = 0;
    while(teller < antall){
      System.out.println("YEEEEEEE");
      teller++;

    if(teller%3==0){
        System.out.println(" ");
      }
    }
  }
}
