package AstahClasses;

import java.util.ArrayList;

public class Main {
	
	public static void main(String []args)
	{		
		Profesor prof = new Profesor("NumeProf1", "PrenumeProf1", "123123123132", "Departament", "Functie");
		Secretara secretara = new Secretara("NumeSecretara1", "PrenumeSecretara1", "123123123123", "Departament");
		
		Nota n1 = new Nota("Materie1", "Profesor1", 5);
		Nota n2 = new Nota("Materie2", "Profesor2", 10);
		Nota n3 = new Nota("Materie3", "Profesor3", 7.5);
		ArrayList<Nota> listaNote1 = new ArrayList<Nota>();
		listaNote1.add(n1);
		listaNote1.add(n2);
		listaNote1.add(n3);
		
		Nota n4 = new Nota("Materie4", "Profesor4", 2);
		Nota n5 = new Nota("Materie5", "Profesor5", 9);
		Nota n6 = new Nota("Materie6", "Profesor6", 8.5);
		ArrayList<Nota> listaNote2 = new ArrayList<Nota>();
		listaNote2.add(n4);
		listaNote2.add(n5);
		listaNote2.add(n6);
		
		Nota n7 = new Nota("Materie1", "Profesor7", 4);
		Nota n8 = new Nota("Materie2", "Profesor8", 7.25);
		Nota n9 = new Nota("Materie3", "Profesor9", 9.11);
		ArrayList<Nota> listaNote3 = new ArrayList<Nota>();
		listaNote3.add(n7);
		listaNote3.add(n8);
		listaNote3.add(n9);

		CursOptional cursOptional1 = new CursOptional("NumeCurs1", 2, prof);
		CursOptional cursOptional2 = new CursOptional("NumeCurs2", 1, prof);
		CursOptional cursOptional3 = new CursOptional("NumeCurs3", 1, prof);	
			
		Student s1 = new Student("Nume1", "Prenume1", "12321313123", 123123, listaNote1);
		s1.addPreferinta(cursOptional2);
		s1.addPreferinta(cursOptional1);
		s1.addPreferinta(cursOptional3);
		Student s2 = new Student("Nume2", "Prenume2", "12321313123", 123123, listaNote2);
		s2.addPreferinta(cursOptional2);
		s2.addPreferinta(cursOptional1);
		s2.addPreferinta(cursOptional3);
		Student s3 = new Student("Nume3", "Prenume3", "12321313123", 123123, listaNote3);
		s3.addPreferinta(cursOptional3);
		s3.addPreferinta(cursOptional2);
		s3.addPreferinta(cursOptional1);
		
		ArrayList<Student> listaStudenti = new ArrayList<Student>();
		listaStudenti.add(s1);
		listaStudenti.add(s2);
		listaStudenti.add(s3);
		
		ArrayList<CursOptional> listaCursuriOptionale = new ArrayList<CursOptional>();
		listaCursuriOptionale.add(cursOptional1);
		listaCursuriOptionale.add(cursOptional2);
		listaCursuriOptionale.add(cursOptional3);
		
		Specializare specializare = new Specializare("IS", secretara, listaStudenti, listaCursuriOptionale);
		
		//Algoritm 1
		specializare.PreferinteDupaMedii(listaStudenti, listaCursuriOptionale);	
		
		//Algoritm 2
		//specializare.PreferinteInFunctieDeRestante(listaStudenti, listaCursuriOptionale);
				
		//specializare.afisare();
		
		//Algoritm3
		/*Student s31 = new Student("Nume31", "Prenume31", "12321313123", 123123, listaNote1);
		s31.setPreferinta(cursOptional1);
		Student s32 = new Student("Nume32", "Prenume32", "12321313123", 123123, listaNote2);
		s32.setPreferinta(cursOptional1);
		Student s33 = new Student("Nume33", "Prenume33", "12321313123", 123123, listaNote3);
		s33.setPreferinta(cursOptional3);
		
		ArrayList<Student> listaStudentiAlgoritm3 = new ArrayList<Student>();
		listaStudentiAlgoritm3.add(s31);
		listaStudentiAlgoritm3.add(s32);
		listaStudentiAlgoritm3.add(s33);
		
		Specializare specializare2 = new Specializare("IS", secretara, listaStudentiAlgoritm3, listaCursuriOptionale);
				
		specializare2.OSinguraOptiuneDupaMedieApoiRandom(listaStudentiAlgoritm3, listaCursuriOptionale);
		
		specializare2.afisareAlgoritmOSinguraOptiuneDupaMedieApoiRandom();*/
		
	}
}
