import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import src.HighLifeBoard;

// Testing functionality: calculateNextState()
public class Test6 {

	protected HighLifeBoard HLboard = new HighLifeBoard(10, 10, false);

	@Before
	public void setUp() {
		// Esquina sup-izq
		HLboard.setCell(0, 0, true);
		HLboard.setCell(0, 1, true);
		HLboard.setCell(1, 0, true);
		HLboard.setCell(1, 1, true);
		// Esquina sup-der
		HLboard.setCell(8, 0, true);
		HLboard.setCell(9, 1, true);
		HLboard.setCell(8, 1, true);
		// Esquina inf-der
		HLboard.setCell(8, 9, true);
		HLboard.setCell(9, 8, true);
		// Esquina inf-izq
		HLboard.setCell(1, 8, true);
		HLboard.setCell(1, 9, true);
		HLboard.setCell(0, 9, true);
		// Borde sup
		HLboard.setCell(4, 0, true);
		HLboard.setCell(6, 0, true);
		HLboard.setCell(5, 1, true);
		// Borde inf
		HLboard.setCell(4, 8, true);
		HLboard.setCell(5, 9, true);
		HLboard.setCell(5, 8, true);
		HLboard.setCell(6, 8, true);
		// Borde der
		HLboard.setCell(9, 4, true);
		HLboard.setCell(9, 6, true);
		HLboard.setCell(9, 5, true);
		// Borde izq
		HLboard.setCell(1, 4, true);
		HLboard.setCell(1, 6, true);
		// Internos
		HLboard.setCell(3, 3, true);
		HLboard.setCell(4, 4, true);
		HLboard.setCell(3, 5, true);
		HLboard.setCell(5, 6, true);
		HLboard.setCell(6, 6, true);
		HLboard.setCell(7, 6, true);
	}

	@Test
	public void test_corners() {
		System.out.print("Test 6: Esquinas");
		assertEquals(true, HLboard.calculateNextState(0, 0));
		assertEquals(true, HLboard.calculateNextState(9, 0));
		assertEquals(true, HLboard.calculateNextState(0, 9));
		assertEquals(false, HLboard.calculateNextState(9, 9));
		System.out.println(" -> OK");
	}

	@Test
	public void test_inner() {
		System.out.print("Test 6: Internos");
		assertEquals(true, HLboard.calculateNextState(3, 4));
		assertEquals(true, HLboard.calculateNextState(6, 6));
		assertEquals(true, HLboard.calculateNextState(6, 5));
		assertEquals(false, HLboard.calculateNextState(7, 3));
		System.out.println(" -> OK");
	}
	
	@Test
	public void test_edges() {
		System.out.print("Test 6: Bordes");
		assertEquals(true, HLboard.calculateNextState(5, 0));
		assertEquals(true, HLboard.calculateNextState(9, 5));
		assertEquals(true, HLboard.calculateNextState(5, 9));
		assertEquals(false, HLboard.calculateNextState(0, 5));
		System.out.println(" -> OK");
	}	

	public void tearDown() {
	}
}