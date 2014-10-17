package fallstudieGreg.git.first;

public class Brauerei extends Standort {

	private int kapazität;
	private int kosten;
	private Spieler spieler;
	
	public Brauerei(int kapazität, int kosten, int pos_x, int pos_y, String name, Spieler besitzer, Spieler[] spieler){
		super(pos_x, pos_y, name, besitzer, spieler);
		this.kapazität = kapazität;
		this.kosten = kosten;
		this.spieler = besitzer;
	}

	public void herstellen(int menge){
		spieler.einlagern(kapazität, "Bier");
		spieler.einlagern(-kosten, "Rohstoffe");		
	}
	
	public int getKapazität() {
		return kapazität;
	}

	public void setKapazität(int kapazität) {
		this.kapazität = kapazität;
	}

	public float getKosten() {
		return kosten;
	}

	public void setKosten(float kosten) {
		this.kosten = kosten;
	}
	
	
}
