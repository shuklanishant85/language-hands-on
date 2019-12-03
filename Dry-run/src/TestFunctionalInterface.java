
public class TestFunctionalInterface {

	public static void main(String args[]) {

		FunctionalInterface interfc = () -> System.out.println("Hello world");
		interfc.print();
	}
}
