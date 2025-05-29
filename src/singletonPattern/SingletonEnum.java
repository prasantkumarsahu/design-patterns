package singletonPattern;

public enum SingletonEnum {
	INSTANCE;

	public void doSomething() {
		System.out.println("Singleton using enum");
	}
}
