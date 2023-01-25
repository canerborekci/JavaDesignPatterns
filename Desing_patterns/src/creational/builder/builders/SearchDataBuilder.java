package creational.builder.builders;

import creational.builder.models.SearchData;

public class SearchDataBuilder implements ISearchDataBuilder {
	SearchData searchData = new SearchData();

	@Override
	public void setCustType(String custType) {
		searchData.custType = custType;
		
	}

	@Override
	public void setCustId(String custId) {
		searchData.custId = custId;
		
	}

	@Override
	public void setServiceCriteria(String serviceCriteria) {
		searchData.serviceCriteria = serviceCriteria;
		
	}

	@Override
	public void setServiceNo(String serviceNo) {
		searchData.serviceNo = serviceNo;
		
	}
	
	@Override
	public SearchData searchDataHeader() {
		return searchData;
	}

}
