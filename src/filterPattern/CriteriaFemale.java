package filterPattern;

import java.util.List;

public class CriteriaFemale implements Criteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return persons.stream()
				.filter(person -> person
						.getGender()
						.equalsIgnoreCase("FEMALE"))
				.toList();
	}
}
