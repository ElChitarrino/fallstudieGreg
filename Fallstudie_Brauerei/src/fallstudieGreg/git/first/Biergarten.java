package fallstudieGreg.git.first;

public class Biergarten extends Standort{
	
	private int kapazitšt;
	
	public Biergarten(int kapazitšt, int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.kapazitšt = kapazitšt;
	}

	public void ausschreiben(){
		
	}
	
	public void auswerten(){
		
	}
	
	public int getKapazitšt() {
		return kapazitšt;
	}

	public void setKapazitšt(int kapazitšt) {
		this.kapazitšt = kapazitšt;
	}
	
	
	
}
