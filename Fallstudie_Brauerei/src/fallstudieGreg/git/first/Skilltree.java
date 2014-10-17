
public class Skilltree {
	public Skill wurzel;
	
	
	public Skilltree(){
		wurzel = new Skill(this, null, "Wurzelknoten", "", 0, 100, 0);
		wurzel.setSkill(true, 0);
		
	}
	
}
