
public class Zoo {
	private String name;
	private Gehege[] gehege = new Gehege[10];
	private Personal[] angestellte = new Personal[20];
	private Tier[] tiere = new Tier[20];
	private int gehegeCount=0;
	private int personalCount=0;
	private int tierCount=0;
	
	public Zoo(String name){
		this.name=name;
		System.out.println("Willkommen im " + name +"\n");
	}

	public String getName() {
		return name;
	}
	
	
	
	public Tier[] getTierList(){
		return tiere;
	}
	public Gehege[] getGehegeList(){
		return gehege;
	}
	public Personal[] getPersonalList(){
		return angestellte;
	}
	
	
	
	public void addTier(Tier animal){
		tiere[tierCount]=animal;
		tierCount++;
	}
	public void addGehege(Gehege cage){
		gehege[gehegeCount]=cage;
		gehegeCount++;
	}
	public void addPersonal(Personal personal){
		angestellte[personalCount]=personal;
		personalCount++;
	}
	
	
	
	public void showTiere(){//showTiere
		System.out.println("Tiere des Zoos: ");
		for(int i=0; i<tierCount; i++){
			System.out.println(tiere[i]);
		}
	}
	public void showGehege(){//showGehege
		System.out.println("Vorhandene Gehege: ");
		for(int i=0; i<gehegeCount;i++){
			System.out.println(gehege[i]);
		}
	}
	
	@Override
	public String toString() {
		return "[Zoo] " + name;
	}
}
