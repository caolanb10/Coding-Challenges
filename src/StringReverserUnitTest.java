import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReverserUnitTest {

	String[] testStrings = {"ashasdhiweuif", "hello world", "sandyford", "interview"};
	
	@Test
	void testNonR()
	{
		assertEquals(Master2.stringReverser(testStrings[0].toCharArray()), "fiuewihdsahsa");
		assertEquals(Master2.stringReverser(testStrings[1].toCharArray()), "dlrow olleh");
		assertEquals(Master2.stringReverser(testStrings[2].toCharArray()), "drofydnas");
		assertEquals(Master2.stringReverser(testStrings[3].toCharArray()), "weivretni");
	}
	
	@Test
	void testR()
	{
		assertEquals(Master2.recursiveReverse(testStrings[0].toCharArray()), "fiuewihdsahsa");
		assertEquals(Master2.recursiveReverse(testStrings[1].toCharArray()), "dlrow olleh");
		assertEquals(Master2.recursiveReverse(testStrings[2].toCharArray()), "drofydnas");
		assertEquals(Master2.recursiveReverse(testStrings[3].toCharArray()), "weivretni");
	}

}
