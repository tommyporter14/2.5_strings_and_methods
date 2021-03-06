import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringMethodsTest {

	@Test
	void testReverse() {
		String expected = "yrag";
		String actual = StringMethods.reverse("gary");
		assertEquals(expected, actual);
	}

	@Test
	void testSoLong() {
		String expected = "string";
		String actual = StringMethods.soLong("string", "int");
		assertEquals(expected, actual);
	}
	
	@Test
	void testAfterMath() {
		String expected = "mathematics test";
		String actual = StringMethods.afterMath("she aced the mathematics test");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLetterize() {
		String expected = "j\na\nv\na\n";
		String actual = StringMethods.letterize("java");
		assertEquals(expected, actual);
	}
	
	@Test
	void testCamelCase() {
		String expected = "camelCase";
		String actual = StringMethods.toCamelCase("camel case");
		assertEquals(expected, actual);
	}
	
	@Test
	void testCapital() {
		String expected = "Apple";
		String actual = StringMethods.capitalize("aPpLe");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWaldo() {
		int expected = 9;
		int actual = StringMethods.wheresWaldo("Where is Waldo");
		assertEquals(expected, actual);
	}

	@Test
	void testFirstThings() {
		String expected = "cat dog";
		String actual = StringMethods.firstThingsFirst("dog", "cat");
		assertEquals(expected, actual);
	}
}

