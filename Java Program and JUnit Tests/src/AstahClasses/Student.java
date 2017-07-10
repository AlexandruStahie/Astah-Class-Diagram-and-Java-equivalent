package AstahClasses;

import java.util.ArrayList;

public class Student extends Persoana {
	private int nrMatricol;
	private int nrRestante = 0;
	CursOptional cursOptionalFinal;
	CursOptional preferinta; // folosit la algoritmul OptiuneDupaMedieApoiRandom
	ArrayList<Nota> listaNote = new ArrayList<Nota>();
	ArrayList<CursOptional> listaPreferinte = new ArrayList<CursOptional>();
	
	public Student() {}
	
	public Student(String Nume, String Prenume, String CNP, int nrMatricol, ArrayList<Nota> listaNote)
	{
		super(Nume, Prenume, CNP);
		this.nrMatricol = nrMatricol;
		this.listaNote = listaNote;	
			
		for ( int i = 0; i < listaNote.size(); i++)
		{	
			if(listaNote.get(i).getNota() <=4 )
				nrRestante ++ ;
		}
	}
	
	public CursOptional getCursOptionalFinal()
	{
		return cursOptionalFinal;
	}
	
	public void setNrMatricol(int nrMatricol) {this.nrMatricol = nrMatricol; }
	
	public int getNrMatricol() { return this.nrMatricol; }
	
	public int getNrRestante() {return this.nrRestante; }
	
	public void setPreferinta(CursOptional preferinta) { this.preferinta = preferinta; }
	
	public double getMedia()
	{
		double suma = 0;
		double media = 0;
		for ( int i = 0; i < listaNote.size(); i++)
		{
			suma += listaNote.get(i).getNota();
		}
		media = suma / listaNote.size();
		
		return media;
	}
	
	public ArrayList<CursOptional> getListaPreferinte()
	{
		return this.listaPreferinte;
	}
	
	public void addPreferinta(CursOptional preferinta)
	{
		listaPreferinte.add(preferinta);
	}
	
	public void setCursOptionalFinal (CursOptional curs) { this.cursOptionalFinal = curs; }
	
	public void afisare()
	{
		System.out.println("Numele studentului este: " + this.Nume);
		System.out.println("Prenumele studentului este: " + this.Prenume);
		System.out.println("Nr. matricol al studentului este: " + this.nrMatricol);
		System.out.println("Nr. restante ale studentului este: " + this.nrRestante);
		for(int i = 0; i < listaPreferinte.size(); i++)
			{
				System.out.print("Preferinta nr. " + (i + 1) + " este: ");
				listaPreferinte.get(i).afisarePreferinte();
			}
		System.out.println("Numele optiunii finale este: "+ cursOptionalFinal.getNume());
	}
	
	public void afisareAlgoritmOSinguraOptiuneDupaMedieApoiRandom()
	{
		System.out.println("Numele studentului este: " + this.Nume);
		System.out.println("Prenumele studentului este: " + this.Prenume);
		System.out.println("Nr. matricol al studentului este: " + this.nrMatricol);
		System.out.println("Nr. restante ale studentului este: " + this.nrRestante);
		System.out.println("Preferinta studentului este: " + preferinta.getNume());
		System.out.println("Numele optiunii finale este: "+ cursOptionalFinal.getNume());
	}
	
}
