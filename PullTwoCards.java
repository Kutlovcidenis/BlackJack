import java.util.*;  
public class PullTwoCards {

private int spielerZz1;
private int spielerZz2;
private int spielerZz3;
private int dealerZz1;
private int dealerZz2;
private int dealerZz3;
private int playerTotal;
private int dealerTotal;

public PullTwoCards (int spielerZz1, int spielerZz2,int spielerZz3, int dealerZz1, int dealerZz2,int dealerZz3, int playerTotal, int dealerTotal){

this.spielerZz1 = spielerZz1;
this.spielerZz2 = spielerZz2;
this.spielerZz3 = spielerZz3;
this.dealerZz1 = dealerZz1;
this.dealerZz2 = dealerZz2;
this.dealerZz3 = dealerZz3;
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
  public int getSpielerZz3() {
    return spielerZz2;
  }
  public void setSpielerZz3(int spielerZz3) {
    this.spielerZz3 = spielerZz3;
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
 public int getDealerZz3() {
    return dealerZz3;
  }
  public void setDealerZz3(int dealerZz3) {
    this.dealerZz3 = dealerZz3;
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

    this.playerTotal = (this.spielerZz1 + this.spielerZz2);

    System.out.println( "Your 1st card is: " + this.spielerZz1 );
    System.out.println( "Your 2nd card is: " + this.spielerZz2 );
    System.out.println( "Your total is " + this.playerTotal);
    System.out.println("");
    return playerTotal;
  }


  public int dealerCards() {
  
    this.dealerZz1 = NeueKarte.gebeEineKarte();

    this.dealerZz2 = NeueKarte.gebeEineKarte();

    this.dealerTotal = (this.dealerZz1 + this.dealerZz2);
    System.out.println( "Dealers 1st card is: " + this.dealerZz1 );
    System.out.println( "Dealers 2nd card is: ?");
    return dealerTotal;
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

          
          this.spielerZz3 = NeueKarte.gebeEineKarte();
          System.out.println( "Your new card is: " + this.spielerZz3 );
          playerTotal = (playerTotal + this.spielerZz3);

          System.out.println ("Your toatal: " + this.playerTotal);
        } if ((answer.equals("n") && playerTotal <=21) || (answer.equals("j") && playerTotal ==21)){
          System.out.println("Okay, thank you! Lets take a look"); 
          dealerShowsCard();
          break;

        }  


      }while (playerTotal < 21);
      System.out.println("Dealer WIN!");

    } 
  } 

public void dealerShowsCard() {

    System.out.println( "Dealers 1st card was: " + (this.dealerZz1));
    System.out.println( "Dealers 2nd card was: " + (this.dealerZz2));
    System.out.println( "Dealers sum is: " + (this.dealerTotal));
    System.out.println( "");

    do { 
    if(this.dealerTotal < this.playerTotal ){
          System.out.println("Okay here is your new card");
          System.out.println("");

          this.dealerZz3 = NeueKarte.gebeEineKarte();
          System.out.println( "Your new card is: " + this.dealerZz3 );
           System.out.println( "");
          dealerTotal = (dealerTotal + this.dealerZz3); 
          System.out.println (this.dealerTotal);}   
          }while (this.dealerTotal < this.playerTotal && this.dealerTotal <=21);
          system.out.print("")



          }

}


