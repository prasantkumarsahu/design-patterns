package filterPattern;

import java.util.List;

public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = List.of(
				new Person("Robert", "Male", "Single"),
				new Person("John", "Male", "Married"),
				new Person("Laura", "Female", "Married"),
				new Person("Diana", "Female", "Single"),
				new Person("Mike", "Male", "Single"),
				new Person("Bobby", "Male", "Single")
		);

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		System.out.println("Male: ");
		System.out.println(male.meetCriteria(persons));

		System.out.println("\nFemale: ");
		System.out.println(female.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		System.out.println(singleMale.meetCriteria(persons));

		System.out.println("\nSingle or Females: ");
		System.out.println(singleOrFemale.meetCriteria(persons));
	}
}
