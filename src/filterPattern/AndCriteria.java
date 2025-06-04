package filterPattern;

import java.util.List;

public class AndCriteria implements Criteria{

	private final Criteria criteria;
	private final Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
	}
}
