import java.util.*;  
public class PullTwoCards {
  public static int pullCards() {
    int zufallszahl1;
    zufallszahl1 = NeueKarte.gebeEineKarte();

    int zufallszahl2;
    zufallszahl2 = NeueKarte.gebeEineKarte();

    int playerSum = (zufallszahl2 + zufallszahl1);

    System.out.println( "Your 1st card is: " + zufallszahl1 );
    System.out.println( "Your 2nd card is: " + zufallszahl2 );
    System.out.println( "Your total is " + playerSum);
    System.out.println("");
    return playerSum;
  }


  public static int dealerCards() {
    int zufallszahl1;
    zufallszahl1 = NeueKarte.gebeEineKarte();

    int zufallszahl2;
    zufallszahl2 = NeueKarte.gebeEineKarte();

    int dealerSum = (zufallszahl2 + zufallszahl1);
    System.out.println( "Dealers 1st card is: " + zufallszahl1 );
    System.out.println( "Dealers 2nd card is: ?");
    return dealerSum;
  }

  public static void weiterSpielen (int tmp){ 

    int playerTotal=tmp;


    if(tmp > 0){
      do{
        Scanner in = new Scanner(System.in);  
        System.out.print("Would you like a card? (j/n) "); 
        String answer = in.nextLine();


        if(answer.equals("j")){
          System.out.println("Okay here is your new card");
          System.out.println("");

          int zufallszahl3;
          zufallszahl3 = NeueKarte.gebeEineKarte();
          System.out.println( "Your new card is: " + zufallszahl3 );
          playerTotal = (playerTotal + zufallszahl3);

          System.out.println ("Your toatal: " + playerTotal);
        } if (answer.equals("n") && playerTotal <=21){
          System.out.println("Okay, thank you! Lets take a look"); 

          break;

        }  


      }while (playerTotal <= 21);
      System.out.println("Dealer WIN!");

    } 
  } 







}


