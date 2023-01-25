package creational.builder.builders;

import creational.builder.models.SearchData;

public interface ISearchDataBuilder {
	void setCustType(String custType);
	void setCustId(String custId);
	void setServiceCriteria(String serviceCriteria);
	void setServiceNo(String serviceNo);
	SearchData searchDataHeader();

}
