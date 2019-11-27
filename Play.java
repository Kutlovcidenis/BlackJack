 import java.util.*;  
    public class Play {  
    public static void main(String args[]){  


              Scanner in = new Scanner(System.in);  
              System.out.print("Would you like to play a round of BlackJack? (j/n) ");  
              String answer = in.nextLine();

                      if (answer.equals("j")){
                      System.out.println("Welcome, lets get started");  
                      PullTwoCards.pullCards();
                      }else{
                      System.out.println("Bye, have a nice day");
}}}
