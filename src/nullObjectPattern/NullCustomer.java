package nullObjectPattern;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}
}
