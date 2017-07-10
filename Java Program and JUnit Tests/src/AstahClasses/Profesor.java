package AstahClasses;

public class Profesor extends Persoana {
	private String Departament;
	private String Functie;
	
	public Profesor() {}
	
	public Profesor(String Nume, String Prenume, String CNP, String Departament, String Functie)
	{
		super(Nume, Prenume, CNP);
		this.Departament = Departament;
		this.Functie = Functie;
	}
	
	public void setDepartament(String Departament) { this.Departament = Departament; }
	
	public String getDepartament () { return this.Departament; }
	
	public void setFunctie(String Functie) { this.Functie = Functie; }
	
	public String getFunctie() {return this.Functie; }
	
	public void afisare()
	{
		afisare();
		System.out.println("Departamentul este: " + this.Departament);
		System.out.println("Functia este: " + this.Functie);
	}
}
