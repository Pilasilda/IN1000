//Dette er oppgave 2.4 som omhandler Array
import java.util.Scanner;

class FirstArray{
  public static void main(String[] args) {
    //Lager en array som har plass til heltallene 0,1,2,3
    int[] helTall = {0,1,2,3};

    //Legger tall i array
    int lengdePaaArray = helTall.length;
    int tall = 0;
    while(tall < lengdePaaArray){
      helTall[tall] = tall;
      tall++;
    }
    tall = 0;
    System.out.println("Utskrift av array");

    while(tall < lengdePaaArray){
      //Legger 1337 på forste og siste plass
      helTall[0] = 1337;
      helTall[3] = 1337;

      //Skriver ut array
      System.out.println(helTall[tall]);
      tall++;
    }
    System.out.println(" ");
    System.out.println("Trykk enter ");


    Scanner scan = new Scanner(System.in);
    String[] stringArray = new String[5];
    int teller = 0;

    int navn = stringArray.length;
    stringArray[teller] = scan.nextLine();

    System.out.println("Skriv inn navn ");


    while(teller < stringArray.length){
      stringArray[teller] = scan.nextLine();
      teller++;
    }

    System.out.println(" ");

    teller = 0;
    System.out.println("Tastede navn");

    while(teller < stringArray.length){
      System.out.println(stringArray[teller]);
      teller++;
    }
    System.out.println(" ");
  }

}





  //Skrive ut array med tall
  /*tall = 0;
  System.out.println("Utskrift av negative tall: ");

  while(tall < lengdePaaArray){
    /*if(heltall[tall] < 0){
      System.out.print(heltall[tall]);
    }
    System.out.println(heltall[tall]);
    tall++;
  }*/
