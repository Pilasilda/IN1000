//Dette er oppgave 4.3.
public class Kalkulator{
  //Main metode 
  public static void main(String[] args) {

    //Addisjon
    int addSvar = addisjon(3, 4);
    System.out.println("Sum = " + addSvar);

    //subtraksjon
    int subSvar = subtraksjon(5, 2);
    System.out.println("Differansen = " + subSvar);


    //Heltallsdivisjon
    int helDivSvar = heltallsdivisjon(10, 3);
    System.out.println("Kvotient = " + helDivSvar);


    //Divisjon av kommatall
    double divSvar = divisjon(10, 3);
    System.out.println("Kvotient = " + divSvar);
}

    //Metode for addisjon
    public static int addisjon(int tall, int tall1){
      int sum = tall + tall1;
      return sum;
    }
    //Metode for subtraksjon
    public static int subtraksjon(int tall, int tall1){
      int sum1 = tall - tall1;
      return sum1;
    }
    //Metode for helltllsdivisjon
    public static int heltallsdivisjon(int tall, int tall1){
      int sum2 = tall/tall1;
      return sum2;
    }
    //Metode for divisjon av desimaltall
    public static double divisjon(int tall, int tall1){
      double sum3 = tall/tall1;
      return sum3;
    }
}
