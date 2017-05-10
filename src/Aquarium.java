
public class Aquarium extends Gehege{
	
	private static int aquariumgehegenummer=0;
	
	Aquarium(String name){
		super(name);
		aquariumgehegenummer++;
		System.out.println("[Aquarium "+ aquariumgehegenummer +"]"+ " " + name + " erfolgreich erstellt \n");
			}
	
}
