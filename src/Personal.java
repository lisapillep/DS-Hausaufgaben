
public class Personal extends Personen{
	
	public Personal(String name){
		super(name);
	}

	@Override
	public boolean isEmployee(){
		return true;
	}
}
