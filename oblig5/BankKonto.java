//Klassen BankKonto
class BankKonto{
  //Variable
  private String navn;
  private long kontonummer;
  private double saldo;

//Konstruktør
public BankKonto(String navn, long kontonummer, double saldo){
  this.navn = navn;
  this.kontonummer = kontonummer;
  this.saldo = saldo;
}

//Metode for å printe navn
public String skrivUtNavn(){
  return navn;
}

//Metode for å printe kontonummer
public long skrivUtKontonummer(){
  return kontonummer;
}

//Metode som skal sjekke om du har nok penger til å ta ut summen du vil ta ut
public boolean uttak(double penger){
  if(saldo <= 0){
    return false;
  }
  else{
    return true;
  }
  }
}
