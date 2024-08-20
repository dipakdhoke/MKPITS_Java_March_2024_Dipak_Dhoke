package autowire;

import java.util.List;
import java.util.Map;

public class Student {
	private String name;
	private String city;
	Address ad;
	private List<String> list;
	private Map <String,String> map;
	public Student() {
	}
    public Student(String name) {
    	this.name=name;
    }
    	
    
	public Student(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
   
	public Student(String name, String city, Address ad) {
		this.name = name;
		this.city = city;
		this.ad = ad;
	}
	public Student(String name, String city, Address ad,List list) {
		this.name = name;
		this.city = city;
		this.ad = ad;
		this.list=list;
	}
	
	public Student(String name, String city, Address ad,List list,Map map) {
		this.name = name;
		this.city = city;
		this.ad = ad;
		this.list=list;
		this.map=map;
	}
	
    
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void displaydetails() {
	System.out.println(name+" "+city);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", ad=" + ad + ", list=" + list + ", map=" + map + "]";
	}
	
	

}
