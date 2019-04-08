/* Dette er oppgave 2.5 som omhandler(oppgavetekst):
Lag en metode som sier at om en person er 18 eller mer får han/hun
studentrabatt. Om personen er eldre enn 35år får han/hun ikke
studentrabatt.*/
import java.util.Scanner;
public class MinOppgave2{
  public static void main(String[] args) {
    int tall;
    String input;

    //Oppretter ett scanner objekt
    Scanner scan = new Scanner(System.in);
    //Skriver linje til terminal
    System.out.println("Hvor gammel er du?");

    //Hente ut input fra bruker
    input = scan.nextLine();
    //KOnsvertere fra string til input
    tall = Integer.parseInt(input);

    //Kaller på metode
    studentRabatt(tall);
}

//Metode for studentRabatt
  public static void studentRabatt(int tall){
    if(tall >= 18 && tall <= 35){
      System.out.println("Du faar studentrabatt");
    }
    else{
      System.out.println("Du er ikke egnet for aa faa studentrabatt");
    }

  }
}
