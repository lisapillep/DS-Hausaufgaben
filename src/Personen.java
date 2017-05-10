
public abstract class Personen {
	private String name;
	private Gehege[] gehege = new Gehege[1];
	
	public Personen(String name){
		this.name=name;
	}

	public abstract boolean isEmployee();
}
