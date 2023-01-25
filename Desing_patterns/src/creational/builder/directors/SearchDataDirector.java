package creational.builder.directors;

import creational.builder.builders.ISearchDataBuilder;

public class SearchDataDirector {
	public void searchDataForInd(ISearchDataBuilder sdb) {
		sdb.setCustType("ind");
		sdb.setCustId("123");
		sdb.setServiceCriteria("xdsl no");
		sdb.setServiceNo("311231");
	}
}
