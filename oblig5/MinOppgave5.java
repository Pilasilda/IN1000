/*Lag en klasse Bankkonto og oprett 2 objekter. Lag et grensesnitt for bankontoen. Eks. kan være saldo, navn, bankkonto.
 Kontoen skal sjekke om de to personen kan ta ut folgende summen eller ikke etter hvor mye penger de har på kontoen.*/
public class MinOppgave5{
  public static void main(String[] args){
    //Lager to nye objekter
    BankKonto pilasilda = new BankKonto("Pilasilda", 4900457312131519L, 1500);
    BankKonto derya = new BankKonto("Derya", 490045731314763498L, 1600);
    //Kaller paa metoden fra klassen bankKonto, definerer saa hvor mye vedkommende vil ta ut
    pilasilda.uttak(200);
    derya.uttak(1600);
    pilasilda.skrivUtKontonummer();
    //if-test for aa sjekke om personen kan ta ut 200 kr eller ikke
    if(pilasilda.uttak(200)){
      System.out.println("Du kan ta ut summen. ");
    }
    else{
      System.out.println("Du har ikke nok penger paa kontoen for aa ta ut folgende sum. ");
    }
    //Sjekker om personen kan ta ut 1600 kr eller ikke
    if(derya.uttak(1700)){
      System.out.println("Du har ikke nok penger paa kontoen for aa ta ut folgende sum. ");
    }
    else{
      System.out.println("Du kan ta ut summen. ");
    }
  }
}
