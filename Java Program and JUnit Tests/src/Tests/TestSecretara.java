package Tests;

import AstahClasses.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestSecretara {

	Secretara secretara = new Secretara("Nume", "Prenume", "CNP", "Functie");
	
	@Test
	public void TestGetNume()
	{
		assertTrue(secretara.getNume() == "Nume");
	}
	
	@Test
	public void TestGetPrenume()
	{
		assertTrue(secretara.getPrenume() == "Prenume");
	}
	
	@Test
	public void TestGetCNP()
	{
		assertTrue(secretara.getCNP() == "CNP");
	}
	
	@Test
	public void TestGetFunctie()
	{
		assertTrue(secretara.getFunctie() == "Functie");
	}

}
