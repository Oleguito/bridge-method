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
	@Override
	String getObject() {
		System.out.print("Вызван метод String getObject(): ");
		return object;
	}
}

public class BridgeMethod {
	public static void main(String[] args) {
		MyClass2 object = new MyClass2("Hello World!");
		System.out.println(object.getObject());
	}
}