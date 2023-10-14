package generics.generics_bridge_method;

class MyClass<T> {
	T object;
	MyClass(T object) {
		this.object = object;
	}
	T getObject() {
		return object;
	}
}
class MyClass2 extends MyClass<String> {
	MyClass2(String object) {
		super(object);
	}
	String getObject() {
		return object;
	}
}

public class BridgeMethod {
	public static void main(String[] args) {

	}
}
