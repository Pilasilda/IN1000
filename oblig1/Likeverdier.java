import java.util.Scanner;

class Likeverdier{
  public static void main(String[] args) {
    int c;
    int d;

    Scanner scan = new Scanner(System.in);
    System.out.println("Tast inn ønskede verdi");
    String input = scan.nextLine();
    c = Integer.parseInt(input);

    System.out.println("Tast inn ønskede verdi nummer 2");
    String input2 = scan.nextLine();
    d = Integer.parseInt(input2);

    if(c == d){
      System.out.println("c og d er like");
    }else{
      System.out.println("c og d er ikke like");
    }
  }
}
