package fallstudieGreg.git.first;

public class Brauerei extends Standort {

	private int kapazitšt;
	private int kosten;
	private Spieler spieler;
	
	public Brauerei(int kapazitšt, int kosten, int pos_x, int pos_y, String name, Spieler spieler){
		super(pos_x, pos_y, name);
		this.kapazitšt = kapazitšt;
		this.kosten = kosten;
		this.spieler = spieler;
	}

	public void herstellen(int menge){
		spieler.einlagern(kapazitšt, "Bier");
		spieler.einlagern(-kosten, "Rohstoffe");		
	}
	
	public int getKapazitšt() {
		return kapazitšt;
	}

	public void setKapazitšt(int kapazitšt) {
		this.kapazitšt = kapazitšt;
	}

	public float getKosten() {
		return kosten;
	}

	public void setKosten(float kosten) {
		this.kosten = kosten;
	}
	
	
}
