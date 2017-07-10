package Tests;

import AstahClasses.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestNota {

	Nota nota = new Nota("Materie", "Profesor", 10);
	
	@Test
	public void TestGetMaterie()
	{
		assertTrue(nota.getMaterie() == "Materie");
	}

	@Test
	public void TestGetProfesor()
	{
		assertTrue(nota.getProfesor() == "Profesor");
	}

	@Test
	public void testGetNota()
	{
		assertTrue(nota.getNota()== 10);
	}

}
