import java.util.Scanner;

class Billettpris{
  public static void main(String[] args) {
    int pris = 50;
    int alder;

    Scanner scan = new Scanner(System.in);
    System.out.println("Hva er alderen din? ");
    String input = scan.nextLine();
    alder = Integer.parseInt(input);

    if(alder < 12 || alder >= 67){
      System.out.println("Du skal betale " + (pris/2));
    }else{
      System.out.println("Du skal betale " + pris);
    }
  }
}
