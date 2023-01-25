package creational.builder;

import creational.builder.builders.ISearchDataBuilder;
import creational.builder.builders.SearchDataBuilder;
import creational.builder.directors.SearchDataDirector;
import creational.builder.models.SearchData;

public class Main {

	public static void main(String[] args) {
		ISearchDataBuilder sdb = new SearchDataBuilder();	
		SearchDataDirector sdd = new SearchDataDirector();
		
		sdd.searchDataForInd(sdb);
		SearchData sd = sdb.searchDataHeader();
		
		System.out.println(sd.toString());
	}

}
