
public class Spieler {
	private String name;
	private int umsatz_akt;
	private int umsatz_ges;
	private float kontostand;
	private boolean ist_am_zug;
	private int range;
	Lager meinLager;
	
	public void Spieler(String pName){
		name = pName;
		meinLager = new Lager();
	}
	
	public void einkaufen(int pMenge){
		float preis = DauerLieferant.liefern(pMenge);
		kontostand = kontostand - preis;
	}
	
	public void verkaufen(){
		
	}
	
	public void einlagern(int pMenge, String pTyp){
			if(pTyp.equals("Bier")){
				int neuerBestand = meinLager.getBier()+pMenge;
				meinLager.setBier(neuerBestand);	
			}
			else if(pTyp.equals("Rohstoffe")){
				int neuerBestand = meinLager.getRohstoffe()+pMenge;
				meinLager.setRohstoffe(neuerBestand);
			}
			else if(pTyp.equals("Kapazitaet")){
				int neuerBestand = meinLager.getKapazitaet()+pMenge;
				meinLager.setKapazitaet(neuerBestand);
			}
	}
	
	public void angebot_machen(){
		
	}

}
