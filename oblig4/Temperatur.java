//Dette er oppgave 4.1.
import java.util.Scanner;
import java.io.File;

class Temperatur{
  public static void main(String[] args)throws Exception{
    int sum = 0;
    Scanner filLeser = new Scanner(new File("temperatur.txt"));

    int[] temperatur = new int[12];

    //for-lokke for utskrift av array
    for(int i = 0; i < temperatur.length; i++){
      temperatur[i] = Integer.parseInt(filLeser.nextLine());
      System.out.println(temperatur[i]);
    }

    //Summere array
    for(int i=0; i < temperatur.length; i++){
      sum += temperatur[i];
    }

    //Finne gjennomsnitt av array med kommatall
    double snitt = (double) sum / temperatur.length;
    System.out.println("gjennomsnitt er: " + snitt);


  }
}
