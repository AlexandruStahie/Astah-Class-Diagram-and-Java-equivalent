package Tests;

import AstahClasses.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestStudent {

	Profesor prof = new Profesor("NumeProf1", "PrenumeProf1", "123123123132", "Departament", "Functie");
	Nota n1 = new Nota("Materie1", "Profesor1", 4);
	Nota n2 = new Nota("Materie2", "Profesor2", 10);
	Nota n3 = new Nota("Materie3", "Profesor3", 7.5);
	ArrayList<Nota> listaNote = new ArrayList<Nota>();
	CursOptional cursOptional1 = new CursOptional("NumeCurs1", 2, prof);
	CursOptional cursOptional2 = new CursOptional("NumeCurs2", 1, prof);
	CursOptional cursOptional3 = new CursOptional("NumeCurs3", 1, prof);
	ArrayList<CursOptional> listaCursuriOptionale = new ArrayList<CursOptional>();

	Student student;
		
	@Before
	public void SetUp()
	{
		listaNote.add(n1);
		listaNote.add(n2);
		listaNote.add(n3);
		
		listaCursuriOptionale.add(cursOptional1);
		listaCursuriOptionale.add(cursOptional2);
		listaCursuriOptionale.add(cursOptional3);
		
		student = new Student("Nume", "Prenume", "CNP", 123, listaNote);
		student.addPreferinta(cursOptional1);
		student.addPreferinta(cursOptional2);
		student.addPreferinta(cursOptional3);
	}
	
	@Test
	public void TestGetNume()
	{
		assertTrue(student.getNume() == "Nume");
	}
	public void TestGetPrenume()
	{
		assertTrue(student.getPrenume() == "Prenume");
	}
	public void TestGetCNP()
	{
		assertTrue(student.getCNP() == "CNP");
	}
	public void TestGetNrMatricol()
	{
		assertTrue(student.getNrMatricol()== 123);
	}
	public void TestGetNrRestante()
	{
		assertTrue(student.getNrRestante() == 1);
	}
	public void TesstGetMedia()
	{
		assertTrue(student.getMedia() == 7.16);
	}
	public void TestGetListaPreferinta()
	{
		assertTrue(student.getListaPreferinte() == listaCursuriOptionale);
	}
	
}
