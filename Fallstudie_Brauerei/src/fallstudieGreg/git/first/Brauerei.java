package fallstudieGreg.git.first;

public class Brauerei extends Standort {

	private int kapazit�t;
	private int kosten;
	private Spieler spieler;
	
	public Brauerei(int kapazit�t, int kosten, int pos_x, int pos_y, String name, Spieler spieler){
		super(pos_x, pos_y, name);
		this.kapazit�t = kapazit�t;
		this.kosten = kosten;
		this.spieler = spieler;
	}

	public void herstellen(int menge){
		spieler.einlagern(kapazit�t, "Bier");
		spieler.einlagern(-kosten, "Rohstoffe");		
	}
	
	public int getKapazit�t() {
		return kapazit�t;
	}

	public void setKapazit�t(int kapazit�t) {
		this.kapazit�t = kapazit�t;
	}

	public float getKosten() {
		return kosten;
	}

	public void setKosten(float kosten) {
		this.kosten = kosten;
	}
	
	
}
