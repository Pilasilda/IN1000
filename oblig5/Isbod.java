class Isbod{
  //Array for de ansatte
  private String[] ansatte = new String[10];

  //Heltallsvariable for antallAnsatte
  private int antallAnsatte;

  Isbod(int antall){
    this.antallAnsatte = antall;
  }

  public void ansett(String navn){
    if(antallAnsatte < ansatte.length){
      ansatte[antallAnsatte] = navn;
      antallAnsatte++;
      System.out.println("Ansatt " + navn);

    }
  }

  public void gisistemannSparken(){
    antallAnsatte--;
    System.out.println("Gir " + ansatte[antallAnsatte] + " sparken. ");
  }


  public void printAlleAnsatte(){
    for(int i = 0; i < antallAnsatte; i++){
      System.out.println(ansatte[i]);

    }
  }


}


























/*class Isbod{
  //Array for ansatte
  private String[] ansatte = new String[10];
  //Heltallsvariable
  public int antallAnsatte;

  public Isbod(int a){
    this.antallAnsatte = a;
  }

  public int getAntallAnsatte(){
    return antallAnsatte;
  }

  public void ansett(String navn){
    if(antallAnsatte < ansatte.length){
      ansatte[antallAnsatte] = navn;
      antallAnsatte++;
      System.out.println("Ansatte " + navn);
    }
  }

  public void gisistemannSparken(){
    antallAnsatte--;
    System.out.println("Spark ut " + ansatte[antallAnsatte]);
  }

  public void printAlleAnsatte(){
    System.out.println("Skriv ut alle ansatte: ");
    for(int i = 0; i < antallAnsatte; i++){
      System.out.println(ansatte[i]);
    }
  }
}*/
