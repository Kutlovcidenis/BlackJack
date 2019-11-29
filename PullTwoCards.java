import java.util.*;  
public class PullTwoCards {

private int spielerZz1;
private int spielerZz2;
private int dealerZz1;
private int dealerZz2;
private int playerSum;
private int dealerSum;
private int playerTotal;
private int dealerTotal;

public PullTwoCards (int spielerZz1, int spielerZz2, int dealerZz1, int dealerZz2, int playerSum, int dealerSum, int playerTotal, int dealerTotal){

this.spielerZz1 = spielerZz1;
this.spielerZz2 = spielerZz2;
this.dealerZz1 = dealerZz1;
this.dealerZz2 = dealerZz2;
this.playerSum = playerSum;
this.dealerSum = dealerSum;
this.playerTotal = playerTotal;
this.dealerTotal = dealerTotal;
}

public int getSpielerZz1() {
    return spielerZz1;
  }
  public void setSpielerZz1(int spielerZz1) {
    this.spielerZz1 = spielerZz1;
  }
  public int getSpielerZz2() {
    return spielerZz2;
  }
  public void setSpielerZz2(int spielerZz2) {
    this.spielerZz2 = spielerZz2;
  }
  public int getDealerZz1() {
    return dealerZz1;
  }
  public void setDealerZz1(int dealerZz1) {
    this.dealerZz1 = dealerZz1;
  }
  public int getDealerZz2() {
    return dealerZz2;
  }
  public void setDealerZz2(int dealerZz2) {
    this.dealerZz2 = dealerZz2;
  }
  public int getPlayerSum() {
    return playerSum;
  }
  public void setPlayerSum(int playerSum) {
    this.playerSum = playerSum;
  }
  public int getDealerSum() {
    return dealerSum;
  }
  public void setDealerSum(int dealerSum) {
    this.dealerSum = dealerSum;
  }
 public int getDealerTotal() {
    return dealerTotal;
  }
  public void setDealerTotal(int dealerTotal) {
    this.dealerTotal = dealerTotal;
  }
   public int getPlayerTotal() {
    return playerTotal;
  }
  public void setPlayerTotal(int playerTotal) {
    this.playerTotal = playerTotal;
  }


  public int pullCards() {
   
    this.spielerZz1 = NeueKarte.gebeEineKarte();

    
    this.spielerZz2 = NeueKarte.gebeEineKarte();

    this.playerSum = (this.spielerZz1 + this.spielerZz2);

    System.out.println( "Your 1st card is: " + this.spielerZz1 );
    System.out.println( "Your 2nd card is: " + this.spielerZz2 );
    System.out.println( "Your total is " + this.playerSum);
    System.out.println("");
    return playerSum;
  }


  public int dealerCards() {
  
    this.dealerZz1 = NeueKarte.gebeEineKarte();

    this.dealerZz2 = NeueKarte.gebeEineKarte();

    int dealerSum = (this.dealerZz1 + this.dealerZz2);
    System.out.println( "Dealers 1st card is: " + this.dealerZz1 );
    System.out.println( "Dealers 2nd card is: ?");
    return dealerSum;
  }

  public void weiterSpielen (){ 


    if(this.playerTotal > 0){
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


