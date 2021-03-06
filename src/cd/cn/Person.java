package cd.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Showing some typical usage of Lambda expression. 
 * @author i330344
 *
 */
public class Person {
	

	private static Map<String,Person> personCache = new HashMap<>();
	
	
	public Map<String, Person> getPersonCache() {
		return personCache;
	}

	private int worktime;
	
	public int getWorktime() {
		return worktime;
	}
	public void setWorktime(int worktime) {
		this.worktime = worktime;
	}

	private Address address;
	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name){
		this.name=name;
	}
	public Person(int age,String name,int worktime, Address address){
		this.age=age;
		this.name=name;
		this.worktime=worktime;
		this.address=address;
	}
	
	@Override
	public String toString(){
		return ("Name: "+getName()+"   Age: "+getAge()+"   Worktime: "+getWorktime()+" Address: "+getAddress());
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getProvince(){
		return getAddress().getProvince();
	}
	
	public boolean isFromShanxi(){
		return getProvince().equals("Shanxi");
	}
	
	private static Person createPerson(int age,String name,int worktime, String nation,String province,String city){
		return new Person(age, name, worktime ,new Address(nation, province, city));
	}
	
	public static List<Person> mockUpDb(){
		Person Ten = createPerson(10,"Ten",2,"China","Shanxi", "Xiaan");
		Person Eleven = createPerson(13,"Thirteen",3,"China","Shanxi", "Shangluo");
		Person Twelve = createPerson(11,"Eleven",4,"China","Hebei", "Hengshui");
		Person Thirteen = createPerson(12,"Twelve",2,"China","Shandong", "Yantai");
		List<Person> people =new ArrayList<Person>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(Ten);
				add(Eleven);
				add(Twelve);
				add(Thirteen);
			}
		};
		return people;
	}
	
	public static void main(String[] as){
		List<Person> people =mockUpDb();
		getStream(people).forEach(p->System.out.println(p));
		//Caution here !!! One stream can not be used repeatedly
		Map<Boolean,List<Person>> laoShan = getStream(people).collect(Collectors.partitioningBy(Person::isFromShanxi));
		Map<String,List<Person>> localPeople = getStream(people).collect(Collectors.groupingBy(Person::getProvince));
		System.out.println("Laoshan: "+laoShan.get(true));
		show("Shanxi",localPeople);
		show("Shandong",localPeople);
		show("Hebei",localPeople);
		
		double aveAge = getStream(people).collect(Collectors.averagingInt(p->p.getAge()));
		System.out.println("Average Age: "+aveAge);
		
		String nameList = getStream(people).map(p->p.getName()).collect(Collectors.joining(",", "<", ">"));
		System.out.println("NameList: "+nameList);
		
		Map<String,Long> numOfProvince =getStream(people).collect(Collectors.groupingBy(p->p.getProvince(), Collectors.counting()));
 		show("Shanxi",numOfProvince);
		show("Shandong",numOfProvince);
		show("Hebei",numOfProvince);
		
		Map<String,List<String>> peopleOfProvince = getStream(people).
				collect(Collectors.groupingBy(Person::getProvince,
						Collectors.mapping(Person::getName, Collectors.toList())));
		show("Shanxi",peopleOfProvince);
		show("Shandong",peopleOfProvince);
		
		//use Map for cache
		for(int i=0;i<3;i++){
			Person tPerson = personCache.computeIfAbsent("Ten", Person::new);
			/*
					personCache.get("Ten");
			if(tPerson==null){
				tPerson = Ten;
				personCache.put("Ten", tPerson);
				System.out.println("Puting");
			}
			*/
			System.out.println(tPerson);
		}
		
		//Refactoring with lambda {Void WET}
		int ageTotal = countAge();
		int workTimeTotal = countWorktime();
		System.out.println(ageTotal+" "+workTimeTotal);
	}
	
	public static  <T> Stream<T> getStream(List<T> list){
		return list.parallelStream();
		
	}
	
	public static <V> void show(String location,Map<String,V> map){
		System.out.println(location+": "+map.get(location));
	}
	
	public Person getPersonFromCache(String name){
		Person person = personCache.get(name);
		if(person==null){
			person = new Person();
			personCache.put(name, person);
		}
		return person;
	}
	
	public static  <T> int countFeature(ToIntFunction<Person> function){
		return mockUpDb().stream().mapToInt(function).sum();
	}
	
	public static int countAge(){
		return countFeature(p->p.getAge());
	}
	
	public static int countWorktime(){
		return countFeature(p->p.getWorktime());
	}

}
