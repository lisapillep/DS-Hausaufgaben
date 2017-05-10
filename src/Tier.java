
public abstract class Tier implements ITier{

	private String name;
	private Gehege[] gehege = new Gehege[10];
	private int tierCount=0;
	
	public Tier(String name) {
		this.name=name;// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public boolean addTierToCage(Gehege cage) {
		if(tierCount >= gehege.length)//länger als Bücherliste
			return false;
		
		gehege[tierCount] = cage;
		tierCount++;		
		return true;
		
	}


}
