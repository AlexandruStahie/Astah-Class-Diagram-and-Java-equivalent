package AstahClasses;

public class Secretara extends Persoana {
	private String Functie;
	
	public Secretara() {}
	
	public Secretara(String Nume, String Prenume, String CNP, String Functie)
	{
		super(Nume, Prenume, CNP);
		this.Functie = Functie;
	}
	
	public void setFunctie(String Functie) {this.Functie = Functie; }
	
	public String getFunctie() { return this.Functie; }
	
	public void afisare()
	{
		System.out.println("Numele secretarei este: " + this.Nume);
		System.out.println("Prenumele secretarei este: " + this.Prenume);
		System.out.println("Functia secretarei este: " + this.Functie);
	}
	
	public int verificaDisponibilitate(CursOptional x)
	{
		return x.getNrLocuri();
	}
}
