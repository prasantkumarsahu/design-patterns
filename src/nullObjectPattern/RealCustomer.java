package nullObjectPattern;

public class RealCustomer extends AbstractCustomer{

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}
}
