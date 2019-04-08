/*Les inn filen vilkarligeTall.txt og skriv ut innholdet i text filen.
Sjekk så hvor mange ganger tallet 3 forekommer.Lag så en metode som heter multiplisere som tar
imot to heltall og returnerer summen av disse tallene. Så test programmet og print resultatet.
Når du tester programmet skal du bruke tallet du ville sjekke hvor mange ganger forkom og tallet
for antall ganger det forkom.*/

import java.util.Scanner;
import java.io.File;

public class MinOppgave4{
  public static void main(String[] args) throws Exception{
    int tall = 0;
    //Scanner objekt for Innlesing av fil
    Scanner filLeser = new Scanner(new File("vilkarligeTall.txt"));

    //Løkke for å hente innhold i fil og skrive ut
    String ord = " ";
    while(filLeser.hasNextLine()){
      ord = filLeser.nextLine();
      System.out.println(ord);
      //If-test for å sjekke antall 3ere
      if(ord.equals("3")){
        tall++;
      }
    }
    //Skriver ut antall ganger tallet forekommer
    System.out.println("Tallet forekommer: " + tall);
    int multi = multiplisere(3,2);
    System.out.println("Produktet blir = " + multi);
  }

  public static int multiplisere(int tall, int tall2){
    int sum = tall * tall2;
    return sum;
  }
}
