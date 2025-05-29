package singletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		SingleObject singleObject = SingleObject.getInstance();
		singleObject.showMessage();

		// Best practice in JAVA
		SingletonEnum instance = SingletonEnum.INSTANCE;
		instance.doSomething();
	}
}
