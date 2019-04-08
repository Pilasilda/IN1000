class Ord{
  //Variabler
  private int antall = 0;
  private String tekst;
  public Ord(String tekst){
    this.tekst = tekst;}
  public String toString(){
  //Returnerer ordet
  return tekst;}
  public int hentAntall(){
    //Henter data om hvor mange ganger ordet forekommer
    return antall;
  }
  public void oekAntall(){
    //registrerer at ordet har forekommet en gang til.
    antall += 1;  }
  public int hentLengde(){
  //Returnerer lengden til ordet
  return tekst.length();
  }
  public int plassiDokument(){
  /*basert på antall forekomster av ordet og dets størrelse returnere hvor mye plass ordet
  tar i tekstdokumentet vi leser*/
  return antall * tekst.length();
  }}
