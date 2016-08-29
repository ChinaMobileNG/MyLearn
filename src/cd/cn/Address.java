package cd.cn;

public class Address {
	
	private String Nation;
	private String Province;
	public void setNation(String nation) {
		Nation = nation;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public void setCity(String city) {
		City = city;
	}

	private String City;
	
	public String getNation() {
		return Nation;
	}
	public String getProvince() {
		return Province;
	}
	public String getCity() {
		return City;
	}
	public Address(String nation,String province,String city){
		Nation=nation;
		Province=province;
		City=city;
	}
	
	public String toString(){
		return "Nation: "+getNation()+" Province: "+getProvince()+" City: "+getCity();
		
	}

}
