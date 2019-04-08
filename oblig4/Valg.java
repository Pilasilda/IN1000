import java.io.File;
import java.util.Scanner;

class Valg{
  public static void main(String[] args) throws Exception{
    Scanner filLeser = new Scanner(new File("stemmer.txt"));
    String[] valg = new String[456];
    int[] stemmer = new int[4];

    //Lagre alle stemmer i en string array
    for(int i = 0; filLeser.hasNextLine(); i++){
      valg[i] = filLeser.nextLine();
    }
    //Bruker en lokke for å gå gjennom array lagrer antall stemmer forhvert parti
    for(int i = 0; i < valg.length; i++){
      if(valg[i].equals("Sp")){
        stemmer[0]++;
      }else if(valg[i].equals("Ap")){
        stemmer[1]++;
      }else if(valg[i].equals("KrF")){
        stemmer[2]++;
      }else if(valg[i].equals("h")){
        stemmer[3]++;
      }
    }
    System.out.println("Senterpartiet har: " + stemmer[0] + " stemmer. ");
    //Kaller på metode finneProsent og sender med tallet som ble skrevet ut ovenfor
    double prosentAvStemmer = prosent(456,135);
    //Skriver ut prosentAndel av stemmer
    System.out.println("SP: Utgjor " + prosentAvStemmer + "% av valg stemmene. ");
    System.out.println(" ");
    //Skriver ut antall stemmer for Ap
    System.out.println("Arbeiderpartiet har: " + stemmer[1] + " stemmer. ");
    //Kaller på metode finneProsent og sender med tallet som ble skrevet ut ovenfor
    double prosentAvStemmer2 = prosent(456, 159);
    //Skriver ut prosentAndel av stemmer
    System.out.println("AP: Utgjor " + prosentAvStemmer2 + "% av valg stemmene. ");
    System.out.println(" ");
    //Skriver ut antall stemmer for KrF
    System.out.println("Kristligfolkeparti har: " + stemmer[2] + " stemmer. ");
    //Kaller på metode finneProsent og sender med tallet som ble skrevet ut ovenfor
    double prosentAvStemmer3 = prosent(456, 36);
    //Skriver ut prosentAndel av stemmer
    System.out.println("KrF: Utgjor " +  prosentAvStemmer3 + "% av valg stemmene. ");
    System.out.println(" ");
    //Skriver ut antall stemmer for hoyre
    System.out.println("Hoyre har: " + stemmer[3] + " stemmer. ");
    //Kaller på metode finneProsent og sender med tallet som ble skrevet ut ovenfor
    double prosentAvStemmer4 = prosent(456, 126);
    //Skriver ut prosentAndel av stemmer
    System.out.println("H: Utgjor " + prosentAvStemmer4 + "% av valg stemmene. ");
    System.out.println("  ");
    //Utksrift av valgets vinner
    System.out.println("Valgets vinner er Arbeiderpartiet");
}

  //Metode for å finne prosent
  public static double prosent(double tall, double tall1){
    double sum = (tall1/tall) * 100;
    return sum;
  }
}
