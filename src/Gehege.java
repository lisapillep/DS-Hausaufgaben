
public abstract class Gehege {
	private String name;
	private Tier[] tiere = new Tier[10];
	private int animalCount=0;
	
	public Gehege(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

}
