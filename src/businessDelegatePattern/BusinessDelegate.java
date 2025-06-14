package businessDelegatePattern;

public class BusinessDelegate {

	private final BusinessLookUp lookUpService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookUpService.getBusinessService(serviceType);

		businessService.doProcessing();
	}
}
