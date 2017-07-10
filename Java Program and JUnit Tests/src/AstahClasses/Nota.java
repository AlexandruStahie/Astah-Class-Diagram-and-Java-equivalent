package AstahClasses;

public class Nota {
	private String Materie;
	private String Profesor; //proful care a pus nota
	private double Nota;
	
	public Nota(){}
	
	public Nota(String Materie, String Profesor, double Nota)
	{
		this.Materie = Materie;
		this.Profesor = Profesor;
		this.Nota = Nota;
	}
	
	public void setMaterie(String Materie) { this.Materie = Materie; }
	
	public String getMaterie() { return this.Materie; }
	
	public void setProfesor(String Profesor) {this.Profesor = Profesor; }
	
	public String getProfesor() { return this.Profesor; }
	
	public void setNota(int Nota) { this.Nota = Nota; }
	
	public double getNota() { return this.Nota; }
	
	public void afisare()
	{
		System.out.println("Materia este: " + this.Materie);
		System.out.println("Profesorul este: " + this.Profesor);
		System.out.println("Nota este: " + this.Nota);
	}
}
