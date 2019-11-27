public class PullTwoCards {
  public static void pullCards() {
    int zufallszahl1;
    zufallszahl1 = (int)(Math.random() * 10) + 1;

    int zufallszahl2;
    zufallszahl2 = (int)(Math.random() * 10) + 1;

    System.out.println( "Your 1st card is: " + zufallszahl1 );
    System.out.println( "Your 2nd card is: " + zufallszahl2 );
 }
}
