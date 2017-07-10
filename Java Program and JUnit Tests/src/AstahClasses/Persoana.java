package AstahClasses;

public class Persoana {
	protected String Nume;
	protected String Prenume;
	protected String CNP;
	
	public Persoana() {}
	
	public Persoana (String Nume, String Prenume, String CNP)
	{
		this.Nume = Nume;
		this.Prenume = Prenume;
		this.CNP = CNP;
	}
	
	public void setNume(String Nume) {this.Nume = Nume; }
	
	public String getNume() {return this.Nume; }
	
	public void setPrenume(String Prenume) { this.Prenume = Prenume;}
	
	public String getPrenume() {return this.Prenume; }
	
	public void setCNP(String CNP) { this.CNP = CNP; }
	
	public String getCNP() { return this.CNP; }
	
	public void afisare()
	{
		System.out.println("Numele este: " + this.Nume);
		System.out.println("Prenumele este: " + this.Prenume);
		System.out.println("CNP-ul este: " + this.CNP);
	}
	
	
}
