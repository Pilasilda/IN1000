import java.util.Scanner;
class Beslutninger{
  public static void main(String[] args){
  int alder;
  Scanner scan = new Scanner(System.in);
  System.out.println("Tast inn din alder: ");
  String input = scan.nextLine();
  alder = Integer.parseInt(input);

  if(alder >= 18){
    System.out.println("Du er myndig");
  }else{
    System.out.println("Du er ikke mynig");
  }
}
}
