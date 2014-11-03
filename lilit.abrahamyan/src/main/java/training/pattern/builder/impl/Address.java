package training.pattern.builder.impl;

import training.pattern.builder.impl.Address.Builder;

/**
 * Class for representing address/location using builder creation pattern
 * @author LilitsComp
 *
 */
public class Address {

	private String country;
	private String province;
	private String town;
	private String city;
	private String street;
	private String district;
	private int home;
	private int appartment;
	private int building;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getHome() {
		return home;
	}
	public void setHome(int home) {
		this.home = home;
	}
	public int getAppartment() {
		return appartment;
	}
	public void setAppartment(int appartment) {
		this.appartment = appartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public int getBuilding() {
		return building;
	}
	public void setBuilding(int building) {
		this.building = building;
	}

	@Override
	public String toString(){
		 String EOL_STRING = System.getProperty("line.separator"); 
		 return   "country: " + country + EOL_STRING +
				  "province: " + province + EOL_STRING +
				  "town: " + town + EOL_STRING +
				  "city: " + city + EOL_STRING +
				  "street: " + street + EOL_STRING +
				  "building: " + building + EOL_STRING +
				  "home: " + home + EOL_STRING +
				  "appartment: " + appartment + EOL_STRING;
	}
	
	public static class Builder {
		
		private Address address;
		
		public Builder(String country) {
			address = new Address();
			address.setCountry(country);
		}
		
		public Builder country(String country) {
			address.setCountry(country);
			return this;
		}
		public Builder province(String province) {
			address.setProvince(province);
			return this;
		}
		public Builder city(String city) {
			address.setCity(city);
			return this;
		}
		public Builder town(String town) {
			address.setTown(town);
			return this;
		}
		public Builder district(String district) {
			address.setDistrict(district);
			return this;
		}
		public Builder street(String street) {
			address.setStreet(street);
			return this;
		}
		public Builder home(int home) {
			address.setHome(home);
			return this;
		}
		public Builder appartment(int appartment) {
			address.setAppartment(appartment);
			return this;
		}
		
		public Builder building(int building) {
			address.setBuilding(building);
			return this;
		}
		
		public Address build() {
			return address;
		}
	}

}
