package Tests;

import static org.junit.Assert.*;

import org.junit.Before;

import AstahClasses.*;
import org.junit.Test;

public class TestCursOptional {
	
	Profesor prof;
	CursOptional curs;
	
	@Before
	public void SetUp()
	{
		prof = new Profesor("Nume", "Prenume", "CNP", "Departament", "Functie");
		curs = new CursOptional("NumeCurs", 10, prof);
	}
	@Test
	public void TestGetNume()
	{
		assertTrue(curs.getNume() == "NumeCurs");
	}
	
	@Test
	public void TestGetNrLocuri()
	{
		assertTrue(curs.getNrLocuri() == 10);
	}
	
	@Test
	public void TestGetProfesor()
	{
		assertTrue(curs.getProfesor().equals(prof));
	}
	
	@Test
	public void TestDecrementareNrLocuri()
	{
		curs.decrementareNrLocuri();
		assertTrue(curs.getNrLocuri()== 9);
	}
	
}
