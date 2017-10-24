import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitTestSuite.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.print("\n");
			System.out.println(failure.toString());
			System.out.println(failure.getException());
		}
		
		if (result.wasSuccessful()) {
			System.out.println("Todos los tests se han pasado correctamente.");
		}
	}
}  	