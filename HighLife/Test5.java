import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import src.HighLifeBoard;

// Testing functionality: shouldBeBorn()
public class Test5 {

	protected HighLifeBoard HLboard = new HighLifeBoard(10, 10, false);

	@Before
	public void setUp() {
		// Esquina sup-izq
		HLboard.setCell(0, 1, true);
		HLboard.setCell(1, 0, true);
		HLboard.setCell(1, 1, true);
		// Esquina sup-der
		HLboard.setCell(8, 0, true);
		HLboard.setCell(9, 1, true);
		// Esquina inf-der
		HLboard.setCell(8, 8, true);
		// Borde inf
		HLboard.setCell(4, 8, true);
		HLboard.setCell(5, 8, true);
		HLboard.setCell(6, 8, true);
		// Borde der
		HLboard.setCell(8, 4, true);
		HLboard.setCell(8, 6, true);
		HLboard.setCell(9, 5, true);
		// Borde izq
		HLboard.setCell(0, 4, true);
		HLboard.setCell(0, 6, true);
		HLboard.setCell(1, 4, true);
		HLboard.setCell(1, 5, true);
		HLboard.setCell(1, 6, true);
		// Internos
		HLboard.setCell(4, 3, true);
		HLboard.setCell(5, 3, true);
		HLboard.setCell(6, 3, true);
		HLboard.setCell(4, 4, true);
		HLboard.setCell(6, 4, true);
		HLboard.setCell(5, 5, true);
	}

	@Test
	public void test_corners() {
		System.out.print("Test 5: Esquinas");
		assertEquals(true, HLboard.shouldBeBorn(0, 0));
		assertEquals(false, HLboard.shouldBeBorn(9, 0));
		assertEquals(false, HLboard.shouldBeBorn(0, 9));
		assertEquals(false, HLboard.shouldBeBorn(9, 9));
		System.out.println(" -> OK");
	}

	@Test
	public void test_inner() {
		System.out.print("Test 5: Internos");
		assertEquals(false, HLboard.shouldBeBorn(5, 1));
		assertEquals(true, HLboard.shouldBeBorn(5, 4));
		System.out.println(" -> OK");
	}
	
	@Test
	public void test_edges() {
		System.out.print("Test 5: Bordes");
		assertEquals(false, HLboard.shouldBeBorn(5, 0));
		assertEquals(false, HLboard.shouldBeBorn(9, 5));
		assertEquals(true, HLboard.shouldBeBorn(5, 9));
		assertEquals(false, HLboard.shouldBeBorn(0, 5));
		System.out.println(" -> OK");
	}	

	public void tearDown() {
	}
}