package AstahClasses;

public class CursOptional {
	private String Nume;
	private int NrLocuri;
	private Profesor Prof = new Profesor();
	
	public CursOptional() {}
	
	public CursOptional(String Nume, int NrLocuri, Profesor Prof)
	{
		this.Nume = Nume;
		this.NrLocuri = NrLocuri;
		this.Prof = Prof;
	}
	
	public CursOptional(String Nume)
	{
		this.Nume = Nume;
	}
	public void setNume (String Nume) { this.Nume = Nume; }
	
	public String getNume () { return this.Nume; }
	
	public void setNrLocuri (int NrLocuri) { this.NrLocuri = NrLocuri; }
	
	public int getNrLocuri () { return this.NrLocuri; }
	
	public void setProfesor (Profesor prof) { this.Prof = prof; }
	
	public Profesor getProfesor () { return this.Prof; } 
	
	
	public void decrementareNrLocuri() { this.NrLocuri -- ; }
	
	public void afisare()
	{
		System.out.println("Numele cursului optional este: " + this.Nume);
		System.out.println("Numarul de locuri disponibile la cursul optional este: "+ this.NrLocuri);
		Prof.afisare();
	}
	
	public void afisareCursOptional()
	{
		System.out.println("Cursul optional este: " + this.Nume);
	}
	
	public void afisarePreferinte()
	{
		System.out.println(this.getNume());
	}
}
