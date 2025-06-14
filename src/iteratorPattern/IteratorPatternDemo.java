package iteratorPattern;

public class IteratorPatternDemo {
	public static void main(String[] args) {

		NameRepository nameRepository = new NameRepository();

		for (Iterator it = nameRepository.getIterator(); it.hasNext();) {
			String name = (String) it.next();
			System.out.println("Name : " + name);
		}
	}
}
