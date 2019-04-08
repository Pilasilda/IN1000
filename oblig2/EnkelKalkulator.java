/* Detter er oppgave 2.1 som omhandler metode med parameter */
import java.util.Scanner;

class EnkelKalkulator{
  public static void main(String[] args) {
    int tall;
    int tall2;

    //Henter input fra bruker
    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv inn et tall");
    String input = scan.nextLine();
    tall = Integer.parseInt(input);

    //Henter input fra bruker
    System.out.println("Skriv inn neste tallet");
    String input2 = scan.nextLine();
    tall2 = Integer.parseInt(input2);

    sumAvTall(tall, tall2 );
    differanse(tall, tall2);
    produkt(tall, tall2);
  }

  public static void sumAvTall(int tall, int tall2){
   System.out.println("Summen av tallene er " + (tall + tall2));
  }

  public static void differanse(int tall, int tall2){
    System.out.println("Differansen mellom tallene er " + (tall - tall2));
  }

  public static void produkt(int tall, int tall2){
    System.out.println("Produktet av tallene er " + (tall * tall2));
  }

}
