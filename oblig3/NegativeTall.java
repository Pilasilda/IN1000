/* Dette er oppgave 3.3 som omhandler negativetall*/
public class NegativeTall{
  public static void main(String[] args) {
    int[] heltall = {1,4,5,-2,-4,6,10,3,-2};
    int tall = 0;
    int sum = 0;

    int lengdePaaArray = heltall.length;

    while(tall < lengdePaaArray){
      if(heltall[tall] < 0){
        System.out.println("Negative tall i array: " + heltall[tall]);
        heltall[tall] = tall;
      }
      tall++;
    }
    tall = 0;
    while(tall <= lengdePaaArray){
      //I index-plass 3 ligger -2 erstatter derfor -2 med 2
      heltall[3] = 2;
      //I index-plass 4 ligger -4 erstatter derfor -4 med 4
      heltall[4] = 4;
      //I index-plass 8 ligger -8 erstatter derfor -8 med 8
      heltall[8] = 2;


      System.out.println("Naavaerende verdi i array: ["+ tall +"] = " + heltall[tall]);
      //heltall[tall] = tall;
      tall++;
    }
  }
}
