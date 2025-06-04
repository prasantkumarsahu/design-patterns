package filterPattern;

import java.util.Objects;

public class Person {

	private final String name;
	private final String gender;
	private final String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(maritalStatus, person.maritalStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, gender, maritalStatus);
	}

	@Override
	public String toString() {
		return "\nPerson{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", maritalStatus='" + maritalStatus + '\'' +
				'}';
	}
}
