import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

class OrdListe{
  int teller = 0;
  public ArrayList<Ord> ordliste = new ArrayList<>();
  public void lesBok(String filnavn) throws Exception{
    /*Leser alle ordene i en fil og legger dem inn i ordlisten.
    Filen må være organisert slik at det ligger akkurat ett ord på hver
    linje i filen. Filen må være organisert slik at det ligger akkurat ett ord
    på hver linje i filen. Opretter nytt scanner objekt.*/
    Scanner scan = new Scanner(new File(filnavn));//lager ett nytt scanner objekt
    while(scan.hasNextLine()){
        leggTilOrd(scan.nextLine()); //leser gjennom file og legger ordene i listen
      }
    }

  public void leggTilOrd(String ord){
     /*Legger inn et nytt ord i ordlisten hvis det ikke finnes fra før. Hvis ordet allerede er der,
    skal antallet forekomster økes med 1.NB! Her regnes store og små
    som like, så "asp", "Asp" og "ASP" er alle samme ordet.*/
      if(finnOrd(ord) == null){
        ordliste.add(new Ord(ord)); //Legger til ord
      }else{
        Ord temp = finnOrd(ord); //Hvis ord ikke legges til økes antallet av ordet
        temp.oekAntall();
      }
    }
  public Ord finnOrd(String tekst){
    /*finner og returnerer et gitt ord s i ordlisten. Hvis ordet ikke finnes, får vi
    null som svar*/
    for(Ord o : ordliste){
      if(o.toString().equalsIgnoreCase(tekst)){ //sjekker om ordet finnes i listen
        return o;
      }
    }
    return null;
  }
  public int antallOrd(){
  //finner ut og returnerer hvor mange ulike ord det finnes i ordlisten.
    return ordliste.size();
  }
  public int antallForekomster(String tekst){
  //finner ut og returnerer hvor mange ganger ordet "tekst" forekommer i ordlisten.
  for(Ord t : ordliste){
    if(t.toString().equalsIgnoreCase(tekst)){
      t.oekAntall();
      return t.hentAntall(); //Antallet av ord
    }
  }
  return 0;
}
  public Ord[] v anligste5(){
    /*Legger de 5 vanlgiste ordene i en liste med 5 plasser, returnerer så disse ordene.*/
    Ord[] array = new Ord[5]; //array med 5 plasser
    int minste = ordliste.get(0).hentAntall(); //ordlisten sin plass 0
    int index = 0;
    array[0] = ordliste.get(0); //Array = ordliste sin plass 0
    for(int i = 1; i < 5; i++){
      Ord ord = ordliste.get(i);
      array[i] = ord;
      if(ord.hentAntall() < minste){
        minste = ord.hentAntall();
        index = i;
      }
    }
    for(int i = 5; i < ordliste.size(); i++){
      Ord ord = ordliste.get(i);
      if(ord.hentAntall() > minste){
        array[index] = ord;
        //Finner hva som er ny minst, antall og index
        minste = ordliste.get(0).hentAntall();
        index = 0;
        for(int n = 1; n < 5; n++){
          if(array[n].hentAntall() < minste){
            minste = array[n].hentAntall();
            index = n;
          }}}}
      return array;}
  public Ord finnLengste(){
  //finner og returnerer det ordet i ordlisten som er lengst
    int lengde = 0;
    String lang = " ";

    for( Ord  f : ordliste){ //Akkurat det samme som en forløkke.
      if(f.hentLengde() >= lengde){ //Hvis lengden til ordet er større enn eller lik 0
        lengde = f.hentLengde();
        lang = f.toString();
      }
    }
    return finnOrd(lang);
  }
  public Ord finnKorteste(){
  //finner og returnerer det ordet i ordlisten som er kortest
    //Opretter Variabler
  int korteste = 1000;
  String kort = " ";

  for(Ord j : ordliste){
    if(j.hentLengde() <= korteste){ //korteste verdi
    korteste = j.hentLengde();
    kort = j.toString();
  }
 }
 return finnOrd(kort); //Returnerer korteste ordet
}


  public Ord tarMestPlassIDokument(){
  //finner og returnerer det ordet i ordlisten som tar opp mest plass i dokumentet
    //Oppretter Variabler
  int rute = 0;
  Ord cool = null;

  for(int i = 0; i < ordliste.size(); i++){
    if(ordliste.get(i).plassiDokument() > rute){ //Liste sin plass i dokumentet
      rute = ordliste.get(i).plassiDokument();
      cool = ordliste.get(i); //Legger ordlisten i cool
    }
  }
  return cool; //Returnerer cool hvor ordliste er lagt i
}
}
