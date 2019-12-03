
public class DefaultMethodTest implements A/* , B */ {

}

interface A {

	default void print() {
		System.out.print("Default method: hello from inteface A");
	}

}

interface B {
	default void print() {
		System.out.print("Default method: hello from inteface B");
	}
}