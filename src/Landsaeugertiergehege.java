
public class Landsaeugertiergehege extends Gehege{
	
	private static int landsaeugergehegenummer=0;
	
	Landsaeugertiergehege(String name){
		super(name);
		landsaeugergehegenummer++;
		System.out.println("[Landsaeungergehege "+ landsaeugergehegenummer + "]" +" " + name +  " erfolgreich erstellt\n");
	}
	
}
