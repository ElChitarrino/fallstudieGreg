package fallstudieGreg.git.first;

public class Biergarten extends Standort{
	
	private int kapazit�t;
	
	public Biergarten(int kapazit�t, int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.kapazit�t = kapazit�t;
	}

	public void ausschreiben(){
		
	}
	
	public void auswerten(){
		
	}
	
	public int getKapazit�t() {
		return kapazit�t;
	}

	public void setKapazit�t(int kapazit�t) {
		this.kapazit�t = kapazit�t;
	}
	
	
	
}
