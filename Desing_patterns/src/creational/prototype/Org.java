package creational.prototype;

public abstract class Org {
	public int taxId;
	public String corpName;
	
	public Org(){
		
	}
	
	public Org(Org corp) {
		if(corp!= null) {
			taxId = corp.taxId;
			corpName = corp.corpName;
		}
	}
	
	public abstract Org clone();
}
