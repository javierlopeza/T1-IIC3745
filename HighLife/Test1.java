import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import src.HighLifeBoard;

// Testing functionality: setCell()
public class Test1 {

	protected HighLifeBoard HLboard = new HighLifeBoard(10, 10, false);

	@Before
	public void setUp() {
		// Normal cases
		HLboard.setCell(3, 7, true);
		HLboard.setCell(8, 4, true);
		HLboard.setCell(2, 2, true);
		// Edge cases
		HLboard.setCell(0, 5, true);
		HLboard.setCell(5, 0, true);
		HLboard.setCell(9, 5, true);
		HLboard.setCell(5, 9, true);
		HLboard.setCell(0, 0, true);
		HLboard.setCell(0, 9, true);
		HLboard.setCell(9, 0, true);
		HLboard.setCell(9, 9, true);
		// Outer-edge cases
		HLboard.setCell(-1, -1, true);
		HLboard.setCell(10, 10, true);
		HLboard.setCell(-1, 10, true);
		HLboard.setCell(10, -1, true);
		HLboard.setCell(5, -1, true);
		HLboard.setCell(-1, 5, true);
		HLboard.setCell(5, 10, true);
		HLboard.setCell(10, 5, true);
	}

	@Test
	public void test_inner() {
		System.out.print("Test 1: Internos");
		assertEquals(true, HLboard.getData()[3][7]);
		assertEquals(true, HLboard.getData()[8][4]);
		assertEquals(true, HLboard.getData()[2][2]);
		System.out.println(" -> OK");
	}

	@Test
	public void test_edges() {
		System.out.print("Test 1: Bordes");
		assertEquals(true, HLboard.getData()[0][5]);
		assertEquals(true, HLboard.getData()[5][0]);
		assertEquals(true, HLboard.getData()[9][5]);
		assertEquals(true, HLboard.getData()[5][9]);
		System.out.println(" -> OK");
	}

	@Test
	public void test_corners() {
		System.out.print("Test 1: Esquinas");
		assertEquals(true, HLboard.getData()[0][0]);
		assertEquals(true, HLboard.getData()[0][9]);
		assertEquals(true, HLboard.getData()[9][0]);
		assertEquals(true, HLboard.getData()[9][9]);
		System.out.println(" -> OK");
	}

	@Test
	public void test_outer() {
		System.out.print("Test 1: Externos");
		assertEquals(true, HLboard.getData()[0][0]);
		assertEquals(true, HLboard.getData()[9][9]);
		assertEquals(true, HLboard.getData()[0][9]);
		assertEquals(true, HLboard.getData()[9][0]);
		assertEquals(true, HLboard.getData()[5][0]);
		assertEquals(true, HLboard.getData()[0][5]);
		assertEquals(true, HLboard.getData()[5][9]);
		assertEquals(true, HLboard.getData()[9][5]);
		System.out.println(" -> OK");
	}
	
	public void tearDown() {
	}
}