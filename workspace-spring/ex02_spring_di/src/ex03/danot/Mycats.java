package ex03.danot;

import java.util.ArrayList;

public class Mycats {
	String name,color;
	float weight;
	
	public Mycats(String name, float weight, ArrayList<String> hobby) {
		this.name = name;
		this.weight = weight;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	ArrayList<String> hobby;
	
	public void catsInfoPrint() {
		System.out.println(name + color + weight);
	}
	
}
