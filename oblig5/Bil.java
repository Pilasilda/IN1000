//Dette er oppgave 5.1
class Bil{
  private int kilometerstand = 0;
  private double tankstorrelse;
  private double bensinforbruk;
  private double tank;

  //Konstruktor
  public Bil(int storrelsePaTank, double forbruk) {
    this.tankstorrelse = storrelsePaTank;
    this.tank = tankstorrelse;
    this.bensinforbruk = forbruk;
  }

// Nok bensin? Kjor "km" kilometer.
public boolean kjorTur(int km){
  if(km*bensinforbruk <= tank){
    kilometerstand += km;
    tank = tank - (km*bensinforbruk);
    return true;
  }else{
    return false;
  }
  }

// Fyll tanken, dersom det er plass til spesifisert mengde bensin.
public boolean fyllTank(double liter){
  if(tank + liter <= tankstorrelse){
    tank = tank + liter;
    System.out.println("Bilen ble fylt med " + liter + " liter bensin. ");
    return true;
  }else{
    System.out.println("Tanken kan ikke fylles. ");
    return false;
  }
}

// Hent maksimal kjoredistanse, gitt bensinmengde på tanken.
public double hentMaksDistanse(){
    return tank/bensinforbruk; //returnerer tankens innhold delt på bensinforbruket
  }
// Hent bilens totale kilometerstand.
public int hentKilometerstand(){
    return kilometerstand; //returnerer kilometerstand
  }
}
