class Oppgave54{
  public static void main(String[] args){
    //Lager nytt objekt
    Isbod minIsbod = new Isbod(0);

    //Registrerer 3 nye ansatte
    minIsbod.ansett("Bjarne");
    minIsbod.ansett("Pilasilda");
    minIsbod.ansett("Rambo");
    minIsbod.ansett("Leo");
    minIsbod.ansett("Per");
    minIsbod.ansett("Ull");
    minIsbod.ansett("Kari");
    minIsbod.ansett("Hans");
    minIsbod.ansett("Grete");
    minIsbod.ansett("Åse");

    System.out.println(" ");

    //Gir sistemann sparken
    minIsbod.gisistemannSparken();

    System.out.println(" ");

    //Ansetter ny
    minIsbod.ansett("Gunnar");
    System.out.println(" ");

    //Printer ansatte etter den nye er ansatt
    minIsbod.printAlleAnsatte();
  }
}
