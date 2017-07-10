package Tests;
import AstahClasses.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestPreferinteDupaMedii {

	@Test
	public void TestAlgoritm13Studenti()
	{
		//creez obiectul de tip profesor si secretara
		Profesor prof = new Profesor("NumeProf1", "PrenumeProf1", "123123123132", "Departament", "Functie");
		Secretara secretara = new Secretara("NumeSecretara1", "PrenumeSecretara1", "123123123123", "Departament");
		
		//creez obiectele de tip nota a studentilor apoi le adaug in lista de note a fiecarui student
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

		//creez cursurile optionale
		CursOptional cursOptional1 = new CursOptional("NumeCurs1", 1, prof);
		CursOptional cursOptional2 = new CursOptional("NumeCurs2", 1, prof);
		CursOptional cursOptional3 = new CursOptional("NumeCurs3", 1, prof);	
			
		//creez studentii
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
		
		//adaug studentii creati in lista de studenti
		ArrayList<Student> listaStudenti = new ArrayList<Student>();
		listaStudenti.add(s1);
		listaStudenti.add(s2);
		listaStudenti.add(s3);
		
		//creez lista cu toate cursurileOptionalePosibile
		ArrayList<CursOptional> listaCursuriOptionale = new ArrayList<CursOptional>();
		listaCursuriOptionale.add(cursOptional1);
		listaCursuriOptionale.add(cursOptional2);
		listaCursuriOptionale.add(cursOptional3);
		
		//creez un obiect de tip specializare, unde are loc algoritmul
		Specializare specializare = new Specializare("IS", secretara, listaStudenti, listaCursuriOptionale);
		
		//aplic algoritmul 1
		specializare.PreferinteDupaMedii(listaStudenti, listaCursuriOptionale);	
		
		//verific rezultatele
		assertTrue(s1.getCursOptionalFinal() == cursOptional2);
		assertTrue(s3.getCursOptionalFinal() == cursOptional3);
		assertTrue(s2.getCursOptionalFinal() == cursOptional1);
	}
	
	@Test
	public void TestAlgoritm15Studenti()
	{
		//creez obiectul de tip profesor si secretara
		Profesor prof = new Profesor("NumeProf1", "PrenumeProf1", "123123123132", "Departament", "Functie");
		Secretara secretara = new Secretara("NumeSecretara1", "PrenumeSecretara1", "123123123123", "Departament");
		
		//creez obiectele de tip nota a studentilor apoi le adaug in lista de note a fiecarui student
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
		
		Nota n10 = new Nota("Materie1", "Profesor10", 4);
		Nota n11 = new Nota("Materie2", "Profesor11", 7.25);
		Nota n12 = new Nota("Materie3", "Profesor12", 9.11);
		ArrayList<Nota> listaNote4 = new ArrayList<Nota>();
		listaNote4.add(n10);
		listaNote4.add(n11);
		listaNote4.add(n12);
		
		Nota n13 = new Nota("Materie1", "Profesor13", 10);
		Nota n14 = new Nota("Materie2", "Profesor14", 10);
		Nota n15 = new Nota("Materie3", "Profesor15", 10);
		ArrayList<Nota> listaNote5 = new ArrayList<Nota>();
		listaNote5.add(n13);
		listaNote5.add(n14);
		listaNote5.add(n15);

		//creez cursurile optionale
		CursOptional cursOptional1 = new CursOptional("NumeCurs1", 3, prof);
		CursOptional cursOptional2 = new CursOptional("NumeCurs2", 1, prof);
		CursOptional cursOptional3 = new CursOptional("NumeCurs3", 1, prof);	
			
		//creez studentii
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
		Student s4 = new Student("Nume4", "Prenume4", "12321313123", 123123, listaNote4);
		s4.addPreferinta(cursOptional3);
		s4.addPreferinta(cursOptional2);
		s4.addPreferinta(cursOptional1);
		Student s5 = new Student("Nume5", "Prenume5", "12321313123", 123123, listaNote5);
		s5.addPreferinta(cursOptional1);
		s5.addPreferinta(cursOptional2);
		s5.addPreferinta(cursOptional3);
		
		//adaug studentii creati in lista de studenti
		ArrayList<Student> listaStudenti = new ArrayList<Student>();
		listaStudenti.add(s1);
		listaStudenti.add(s2);
		listaStudenti.add(s3);
		listaStudenti.add(s4);
		listaStudenti.add(s5);
		
		//creez lista cu toate cursurileOptionalePosibile
		ArrayList<CursOptional> listaCursuriOptionale = new ArrayList<CursOptional>();
		listaCursuriOptionale.add(cursOptional1);
		listaCursuriOptionale.add(cursOptional2);
		listaCursuriOptionale.add(cursOptional3);
		
		//creez un obiect de tip specializare, unde are loc algoritmul
		Specializare specializare = new Specializare("IS", secretara, listaStudenti, listaCursuriOptionale);
		
		//aplic algoritmul 1
		specializare.PreferinteDupaMedii(listaStudenti, listaCursuriOptionale);	
		
		//verific rezultatele
		assertTrue(s1.getCursOptionalFinal() == cursOptional2);
		assertTrue(s2.getCursOptionalFinal() == cursOptional1);
		assertTrue(s3.getCursOptionalFinal() == cursOptional3);
		assertTrue(s4.getCursOptionalFinal() == cursOptional1);
		assertTrue(s5.getCursOptionalFinal() == cursOptional1);
	}
}
