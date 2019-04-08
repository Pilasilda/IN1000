import java.util.Scanner;

class Metoder{
  public static void main(String[] args) {
    utskrift();
    utskrift();
    utskrift();
  }
  public static void utskrift(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv inn navn: ");
    String input = scan.nextLine();

    System.out.println("Skriv inn bosted: ");
    String input2 = scan.nextLine();

    System.out.println("Hei " + input + "!" + " Du er fra " + input2 + ".");
    System.out.println(" ");
  }
}
