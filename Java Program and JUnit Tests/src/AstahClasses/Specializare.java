package AstahClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Specializare {
	private String nume;
	private Secretara secretara;
	private ArrayList<Student> listaStudenti = new ArrayList<Student>();
	private ArrayList<CursOptional> listaCursuriOptionale = new ArrayList<CursOptional>();
	
	public Specializare() {}
	
	public Specializare(String nume, Secretara secretara, ArrayList<Student> listaStudenti, ArrayList<CursOptional> listaCursuriOptionale)
	{
		this.nume = nume;
		this.secretara = secretara;
		this.listaStudenti = listaStudenti;
		this.listaCursuriOptionale = listaCursuriOptionale;
	}
	
	public void setNume(String nume) { this.nume = nume; }
	
	public String getNume () { return this.nume; } 
	
	public void setSecretara (Secretara secretara) {this.secretara = secretara; }
	
	public Secretara getSecretara() { return this.secretara;}
	
	public void PreferinteDupaMedii(ArrayList<Student> listaStudenti, ArrayList<CursOptional> cursuriOptionale)
	{	
		//sortez lista de studenti dupa medie descrescator
		Collections.sort(listaStudenti,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
					if (o1.getMedia() < o2.getMedia())
						return 1;
					else if (o1.getMedia() == o2.getMedia())
						return 0;
					return -1;
			}
		});
		
		//trec prin lista de studenti si iau fiecare student
		for(int i = 0; i < listaStudenti.size(); i++)	
		{
			//trec prin lista de cursuri optionale ( sunt la fel de multe ca nr de preferinte )
			for(int j = 0; j < listaCursuriOptionale.size(); j ++ )
			{
				//verific daca gasesc optiunea studentului = 1 curs optional
				if(listaCursuriOptionale.contains(listaStudenti.get(i).listaPreferinte.get(j)))
				{
					//verific daca mai sunt locuri libere la optiunea respectiva
					if( listaStudenti.get(i).listaPreferinte.get(j).getNrLocuri() > 0)
					{
						//adaug studentul la cursul respectiv si decrementez numarul de locuri disponibile
						listaStudenti.get(i).setCursOptionalFinal(listaStudenti.get(i).listaPreferinte.get(j));
						listaStudenti.get(i).listaPreferinte.get(j).decrementareNrLocuri();
						break;
					}
				}
			}
		}			
	}
	
	public void PreferinteInFunctieDeRestante (ArrayList<Student> listaStudenti, ArrayList<CursOptional> cursuriOptionale)
	{
	//sortez lista de studenti dupa medie descrescator
		Collections.sort(listaStudenti,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
					if (o1.getMedia() < o2.getMedia())
						return 1;
					else if (o1.getMedia() == o2.getMedia())
						return 0;
					return -1;
			}
		});
		
		//creez o lista de studenti unde vor fi pusi studentii cu restante care urmeaza a fi repartizati dupa
		ArrayList<Student> listaStudentiCuRestante = new ArrayList<Student>();
		
		//trec prin lista de studenti si iau fiecare student
		for(int i = 0; i < listaStudenti.size(); i++)	
		{
			//trec prin lista de cursuri optionale (sunt la fel de multe ca nr de preferinte ) 
			for(int j = 0; j < listaCursuriOptionale.size(); j ++ )
			{
				//verific daca gasesc optiunea studentului = 1 curs optional
				if(listaCursuriOptionale.contains(listaStudenti.get(i).listaPreferinte.get(j)))
				{
					//verific daca studentul are restante si nu este introdus inca in lista de studenti cu restante
					if(listaStudenti.get(i).getNrRestante() > 0 && !listaStudentiCuRestante.contains(listaStudenti.get(i)))
					{					
						//studentul are restante => il pun in lista creata mai sus 
						listaStudentiCuRestante.add(listaStudenti.get(i));
						break;
					}
					else
					{
						//daca studentul nu are restante
						//verific daca mai sunt locuri libere la optiunea respectiva
						if( listaStudenti.get(i).listaPreferinte.get(j).getNrLocuri() > 0)
						{
							//adaug studentul la cursul respectiv si decrementez numarul de locuri disponibile
							listaStudenti.get(i).setCursOptionalFinal(listaStudenti.get(i).listaPreferinte.get(j));
							listaStudenti.get(i).listaPreferinte.get(j).decrementareNrLocuri();
							break;
						}
					}
				}
			}
		}
		//verific daca am studenti cu restante iar daca lista nu e goala, refac procedura pt studentii cu restante
		if(!listaStudentiCuRestante.isEmpty())
		{	
			//trec prin lista de studenti si iau fiecare student
			for(int i = 0; i < listaStudentiCuRestante.size(); i++)	
			{
				//trec prin lista de cursuri optionale (sunt la fel de multe ca nr de preferinte
				for(int j = 0; j < listaCursuriOptionale.size(); j ++ )
				{
					//verific daca gasesc optiunea studentului = 1 curs optional
					if(listaCursuriOptionale.contains(listaStudentiCuRestante.get(i).listaPreferinte.get(j)))
					{
						//verific daca mai sunt locuri libere la optiunea respectiva
						if(listaStudentiCuRestante.get(i).listaPreferinte.get(j).getNrLocuri() > 0)
						{
							//adaug studentul la cursul respectiv si decrementez numarul de locuri disponibile
							listaStudentiCuRestante.get(i).setCursOptionalFinal(listaStudentiCuRestante.get(i).listaPreferinte.get(j));
							listaStudentiCuRestante.get(i).listaPreferinte.get(j).decrementareNrLocuri();
							break;
						}
					}
				}
			}
		}
	}
	
	public void OSinguraOptiuneDupaMedieApoiRandom(ArrayList<Student> listaStudenti, ArrayList<CursOptional> cursuriOptionale)
	{
		//sortez lista de studenti dupa medie descrescator
		Collections.sort(listaStudenti,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
					if (o1.getMedia() < o2.getMedia())
						return 1;
					else if (o1.getMedia() == o2.getMedia())
						return 0;
					return -1;
			}
		});
		
		ArrayList<Student> listaStudentiPentruRedistribuitRandom = new ArrayList<Student>();
		
		//trec prin lista de studenti si iau fiecare student
		for(int i = 0; i < listaStudenti.size(); i++)	
		{
			//verific daca gasesc optiunea studentului = un curs optional
			if(listaCursuriOptionale.contains(listaStudenti.get(i).preferinta))
			{
				//verific daca mai sunt locuri libere la optiunea respectiva
				if( listaStudenti.get(i).preferinta.getNrLocuri() > 0)
				{
					//adaug studentul la cursul respectiv si decrementez numarul de locuri disponibile
					listaStudenti.get(i).setCursOptionalFinal(listaStudenti.get(i).preferinta);
					listaStudenti.get(i).preferinta.decrementareNrLocuri();
					
					//verific daca un anumit curs optional a ramas fara locuri dispnibile, il scot din lista
					if(listaStudenti.get(i).preferinta.getNrLocuri() == 0)
					{
						listaCursuriOptionale.remove(listaStudenti.get(i).preferinta);
					}
				}
			}
			else
			{
				//adaug studentul in lista pentru redistribuirea random
				listaStudentiPentruRedistribuitRandom.add(listaStudenti.get(i));
			}
		}
		
		//verific daca listaStudentiPentruRedistribuitRandom nu e goala
		if(!listaStudentiPentruRedistribuitRandom.isEmpty())
		{
			//trec prin lista de studenti si iau fiecare student
			for(int i = 0; i < listaStudenti.size(); i++)	
			{
				  //generez un index random pentru un curs optional inca disponibil
				  Random randomGenerator = new Random();
				  int indexCursRandom = randomGenerator.nextInt(listaCursuriOptionale.size());
				  
				  //verific daca la cursul generat random mai sunt locuri
				  if(listaCursuriOptionale.get(indexCursRandom).getNrLocuri() > 0)
				  {
					  //daca mai sunt locuri libere, pun studentul aici
					  listaStudenti.get(i).setCursOptionalFinal(listaCursuriOptionale.get(indexCursRandom));
					  listaCursuriOptionale.get(indexCursRandom).decrementareNrLocuri();
					  
					  //verificam daca mai sunt locuri la cursul de mai sus
					  if(listaCursuriOptionale.get(indexCursRandom).getNrLocuri() == 0)
						{
							listaCursuriOptionale.remove(listaCursuriOptionale.get(indexCursRandom));
						}		  
				  }
				  else
				  {
					  listaCursuriOptionale.remove(listaCursuriOptionale.get(indexCursRandom));
				  }
			}
		}		
	}
	
	public void afisare()
	{
		System.out.println("Numele specializarii este: " + this.nume);
		System.out.println();
		//secretara.afisare();
		for(int i = 0; i < listaStudenti.size(); i++)
		{
			System.out.println("Studentul: " + (i+1));
			listaStudenti.get(i).afisare();
			System.out.println("Media studentului este: " + listaStudenti.get(i).getMedia());	
			System.out.println();
		}		
	}
	
	//afisarea pentru algoritm 3
	public void afisareAlgoritmOSinguraOptiuneDupaMedieApoiRandom()
	{
		System.out.println("Numele specializarii este: " + this.nume);
		System.out.println();
		//secretara.afisare();
		for(int i = 0; i < listaStudenti.size(); i++)
		{
			System.out.println("Studentul: " + (i+1));
			listaStudenti.get(i).afisareAlgoritmOSinguraOptiuneDupaMedieApoiRandom();
			System.out.println("Media studentului este: " + listaStudenti.get(i).getMedia());	
			System.out.println();
		}		
	}
}

