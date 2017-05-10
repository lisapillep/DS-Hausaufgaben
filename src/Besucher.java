
public class Besucher extends Personen{

	public Besucher(String name){
		super(name);
	}
		
	@Override
	public boolean isEmployee(){
		return false;
	}
}
