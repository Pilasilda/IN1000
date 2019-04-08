//Dette er oppgave 4.2.
import java.util.Scanner;
import java.io.File;

public class Innlesing{
  public static void main(String[] args) throws Exception{
    int tall = 0;
    int tall1 = 0;

    //Leser fra fil
    Scanner filLeser = new Scanner(new File("winnie.txt"));
    //Scanner objekt for aa lese fra terminal
    Scanner scan = new Scanner(System.in);
    //skriver tekst til terminal
    System.out.println("Skriver ønskede ord: ");
    //Leserinput gitt fra bruker
    String tastatur = scan.nextLine();
    //Leser fil
    String ord = " ";

    while(filLeser.hasNextLine()){
      ord = filLeser.nextLine();
      //Test for å finne antall winnie-the-pooh ord det er i txt-fil
      if(ord.equals("winnie-the-pooh")){
        tall1++;
      }
      if(ord.equals(tastatur)){
        tall++;
      }
    }
    //Skriver ut antall ord
    System.out.println("Winnie-the-pooh ble funnet " + tall1 + " ganger.");
    System.out.println("Ordet du ville finne ble funnet " + tall + " ganger.");

    }
}
