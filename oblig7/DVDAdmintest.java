import java.util.Scanner;
public class DVDAdmintest{
public static void main(String[] args) throws Exception{
  //Opretter et objekt av DVDAdministrasjon
  DVDAdministrasjon dvdA = new DVDAdministrasjon();
    //Kaller paa lesinn metoden for aa lese fil

    dvdA.lesInn("dvdarkiv2.txt");
    //Kaller paa menyen-msetoden. Her skrives menyen ut.
    dvdA.meny();
    //Kaller paa ordrelokke-meotden
    dvdA.ordrelokke();

  }
}
