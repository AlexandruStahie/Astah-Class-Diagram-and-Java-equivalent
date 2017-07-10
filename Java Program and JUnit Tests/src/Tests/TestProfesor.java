package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import AstahClasses.Profesor;

public class TestProfesor {
	
	Profesor prof = new Profesor("Nume", "Prenume", "CNP", "Departament", "Functie");

	@Test
	public void TestGetNume()
	{
		assertTrue(prof.getNume() == "Nume");
	}
	
	@Test
	public void TestGetPrenume()
	{
		assertTrue(prof.getPrenume() == "Prenume");
	}
	
	@Test
	public void TestGetCNP()
	{
		assertTrue(prof.getCNP() == "CNP");
	}
	
	@Test
	public void TestGetDeparament()
	{
		assertTrue(prof.getDepartament() == "Departament");
	}
	
	@Test
	public void TestGetFunctie()
	{
		assertTrue(prof.getFunctie() == "Functie");
	}
}
