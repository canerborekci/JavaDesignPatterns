package creational.builder.models;

public class SearchData {

	public String custType;
	public String custId;
	public String serviceCriteria;
	public String serviceNo;
	
	
	
	@Override
	public String toString() {
		return "SearchData [custType=" + custType + ", custId=" + custId + ", serviceCriteria=" + serviceCriteria
				+ ", serviceNo=" + serviceNo + "]";
	}
	
}
