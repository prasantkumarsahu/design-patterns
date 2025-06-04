package filterPattern;

import java.util.List;
import java.util.stream.Stream;

public class OrCriteria implements Criteria{

	private final Criteria criteria;
	private final Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> secondCriteriaItems = otherCriteria.meetCriteria((persons));

		return Stream.concat(firstCriteriaItems.stream(), secondCriteriaItems.stream())
				.distinct()
				.toList();
	}
}
