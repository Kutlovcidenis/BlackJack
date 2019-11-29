import java.util.Random;

/* mit dieser Klasse wird eine Karte zurückgegeben der Aufruf ist z.B.:
		int kartenSpieler = 0;
		int kartenDealer=0;
		kartenSpieler=NeueKarte.gebeEineKarte();
		kartenDealer=NeueKarte.gebeEineKarte();
		Es wird zufällig eine Zahl zischen 1 und 10 zurückgegeben.
		Wobei Bube (11), Dame (12) und König (13) auch den Wert 10 haben.
		Es wird noch kein Spielblatt berücksichtigt.
*/

class NeueKarte {
	 public static int gebeEineKarte() {
	 	Random karte = new Random();
	 	int kartenwert;
		kartenwert=karte.nextInt(13)+1;
		if (kartenwert>9) {kartenwert=10;}
		return kartenwert;
	}
}