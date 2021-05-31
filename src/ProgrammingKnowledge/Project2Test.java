package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class Project2Test {

	@Test
	public void Concattest() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.ConCat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
