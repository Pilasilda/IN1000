/*

Du har følge array int[] array = {2,5,6,8,4,2,10,4,6,1,3}; skriv ut partallene
i arrayen.

 */

public class MinOppgave3{
  public static void main(String[] args){
      int[] array = {2,5,6,8,4,2,10,4,6,1,3};
      int tall = 0;
      int lengdePaaArray = array.length;

      //Sender inn array som argument i kallet for å hente arrayen som er laget
      partall(tall, array);
}


 //Whileløkke for å printe ut partall i array
 //Sender inn array som argument i metoden for å printe ut partallene
  public static void partall(int tall, int[] array){
    while(array.length > tall){
      if(array[tall]%2==0){
        System.out.println(array[tall]);
      }
      tall++;
    }
  }
}
