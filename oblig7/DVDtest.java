class DVDtest{
  public static void main(String[] args) {
    //Opretter et nytt objekt av DVD
    DVD dvd1 = new DVD("jumpstreet", null);

    //Tester HentTittel metode ved å kalle på HentTittel
    System.out.println("Navnet til filmen: " + dvd1.HentTittel());
    //Tester HentEier metode ved å kalle på henteier
    System.out.println("Navnet paa eier er: " + dvd1.HentEier());
    //Tester erUtLaant metode ved å kalle på erUtLaant
    System.out.println("Er filmen laant? " + dvd1.erUtLaant());
  }
}
