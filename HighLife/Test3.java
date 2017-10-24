import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import src.HighLifeBoard;

// Testing functionality: countAliveNeighbors()
public class Test3 {

	protected HighLifeBoard HLboard = new HighLifeBoard(10, 10, false);

	@Before
	public void setUp() {
		// Esquina sup-izq
		HLboard.setCell(0, 0, true);
		HLboard.setCell(0, 1, true);
		HLboard.setCell(1, 1, true);
		HLboard.setCell(1, 0, true);
		// Esquina sup-der
		HLboard.setCell(9, 0, true);
		HLboard.setCell(8, 0, true);
		HLboard.setCell(9, 1, true);
		// Esquina inf-izq
		HLboard.setCell(1, 8, true);
		HLboard.setCell(0, 9, true);
		// Borde sup
		HLboard.setCell(4, 0, true);
		// Borde inf
		HLboard.setCell(5, 8, true);
		HLboard.setCell(5, 9, true);
		HLboard.setCell(6, 8, true);
		HLboard.setCell(6, 9, true);
		// Borde der
		HLboard.setCell(9, 4, true);
		HLboard.setCell(9, 5, true);
		HLboard.setCell(9, 6, true);
	}

	@Test
	public void test_edges() {
		System.out.print("Test 3: Bordes");
		assertEquals(1, HLboard.countAliveNeighbors(5, 0));
		assertEquals(2, HLboard.countAliveNeighbors(9, 5));
		assertEquals(3, HLboard.countAliveNeighbors(5, 9));
		assertEquals(0, HLboard.countAliveNeighbors(0, 5));
		System.out.println(" -> OK");
	}

	@Test
	public void test_inner() {
		System.out.print("Test 3: Internos");
		assertEquals(0, HLboard.countAliveNeighbors(5, 5));
		System.out.println(" -> OK");
	} 

	@Test
	public void test_corners() {
		System.out.print("Test 3: Esquinas");
		assertEquals(3, HLboard.countAliveNeighbors(0, 0));
		assertEquals(2, HLboard.countAliveNeighbors(9, 0));
		assertEquals(1, HLboard.countAliveNeighbors(0, 9));
		assertEquals(0, HLboard.countAliveNeighbors(9, 9));
		System.out.println(" -> OK");
	}

	public void tearDown() {
	}
}