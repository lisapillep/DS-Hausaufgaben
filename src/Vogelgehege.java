
public class Vogelgehege extends Gehege{

	private static int vogelgehegenummer=0;

	
	Vogelgehege(String name){
		super(name);
		vogelgehegenummer++;
		System.out.println("[Vogelgehege "+ vogelgehegenummer +"]"+ " " + name +" "+  "erfolgreich erstellt \n");
		
	}
	

}
