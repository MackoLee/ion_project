package ex06.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			return name.equals(temp.name)&& age == temp.age; 
		}
		return false;
	}
}

public class HashSetEx02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new Person("이상옥", 29));
		set.add(new Person("이상옥", 28));
		set.add(new Person("이상옥", 28));
		set.add(new Person("이상옥", 29));
		set.add("happ");
		
		System.out.println(set);
		
	}
}
