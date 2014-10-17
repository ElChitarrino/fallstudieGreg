package fallstudieGreg.git.first;

public class Biergarten extends Standort{
	
	private int kapazität;
	
	public Biergarten(int kapazität, int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.kapazität = kapazität;
	}

	public void ausschreiben(){
		
	}
	
	public void auswerten(){
		
	}
	
	public int getKapazität() {
		return kapazität;
	}

	public void setKapazität(int kapazität) {
		this.kapazität = kapazität;
	}
	
	
	
}
