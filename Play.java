 import java.util.*;  
 public class Play {  
  public static void main(String args[]){  


    Scanner in = new Scanner(System.in);  
    System.out.print("Would you like to play a round of BlackJack? (j/n) ");  
    String answer = in.nextLine();

    if (answer.equals("j")){
      System.out.println("");
      System.out.println("Welcome, lets get started");
      System.out.println("");  

      PullTwoCards pull = new PullTwoCards(1,1,1,1,1,1,1,1);
      pull.pullCards();
      pull.dealerCards();
      pull.weiterSpielen();

    }else{
      System.out.println("Bye, have a nice day");
    }
  }
}
