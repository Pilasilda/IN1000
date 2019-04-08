/* Dette er oppgave 2.3 som omhandler while-lokker */
import java.util.Scanner;

class SumTall{
  public static void main(String[] args) {
    int tall;

    Scanner scan = new Scanner(System.in);
    System.out.println("Tast inn ønskede tall");
    String input = scan.nextLine();
    tall = Integer.parseInt(input);

   while(tall != 0 ){
     sumAdd(tall);
     System.out.println("Prov igjen");
     input = scan.nextLine();
     tall = Integer.parseInt(input);
   }
   System.out.println("Riktig! ");
}

  public static void sumAdd(int tall){
    System.out.println("Summen av tallene " + (tall + tall));
  }
}
