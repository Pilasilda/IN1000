public class DVD{
  //Varibaler
  private String tittel;
  private Person eier, laaneren;

  //Konstruktør
  public DVD(String tittel, Person p){
    this.tittel = tittel;
    this.eier = p;
  }
  //Metode for å hente tittel til dvd
  public String HentTittel(){
    return tittel;
  }
  //Metode for å hente dvd-ens eier
  public Person HentEier(){
    return eier;
  }
  //Konstruktør
  public void settLaaner(Person person){
    this.laaneren = person;
  }
  //Konstruktør
  public void retur(){
    this.laaneren = null;
  }
  //Metode for å sjekke om dvd-en er laant elller ikke
  public boolean erUtLaant(){
      return laaneren != null;
  }

}
