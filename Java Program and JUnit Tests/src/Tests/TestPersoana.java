package Tests;

import AstahClasses.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestPersoana {

	Persoana persoana = new Persoana("Nume", "Prenume", "CNP");
	
	@Test
	public void TestGetNume()
	{
		assertTrue(persoana.getNume() == "Nume");
	}

	@Test
	public void TestGetPrenume()
	{
		assertTrue(persoana.getPrenume() == "Prenume");
	}
	
	@Test
	public void TestGetCnp()
	{
		assertTrue(persoana.getCNP() == "CNP");
	}
}
