package MPR_Project;

public class Dzial {

	private String Nazwa;

	public Dzial(String  nazwa) {
		
		this.Nazwa=nazwa;	
	}

	public String getNazwa() {
		return Nazwa;
	}

	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}

	public void Dzial()
	{
		System.out.println("Nazwa dzialu : "+Nazwa+"" );
	}
	
}
	
	