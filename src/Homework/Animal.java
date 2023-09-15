package Homework;

public class Animal {

	int age;
	float weight;

	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

	public void speak() {
		System.out.println("年齡=" + age + "\n" + "體重=" + weight);
	}

}