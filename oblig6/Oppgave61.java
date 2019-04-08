class Oppgave61{
  public static void main(String[] args){
    //Ord
    Ord forsteOrd = new Ord("grantre");
    System.out.println(forsteOrd.hentAntall()); //Gir 1

    Ord andreOrd = new Ord("bjerk");
    andreOrd.oekAntall();
    System.out.println(andreOrd.hentAntall()); //Gir 2

    Ord tredjeOrd = new Ord("furu");
    System.out.println(tredjeOrd.hentLengde()); //Gir 4

    Ord fjerdeOrd = new Ord("eik");
    fjerdeOrd.oekAntall();
    fjerdeOrd.oekAntall();
    System.out.println(fjerdeOrd.plassiDokument()); //Gir 9
  }
}
