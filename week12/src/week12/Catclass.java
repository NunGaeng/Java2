package week12;

import java.util.*;

public class Catclass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cat whiteCat = new Cat();
		System.out.println(whiteCat.name);
		
		whiteCat.claw();
		whiteCat.claw(3);
		
		Cat blackCat = new Cat("검은 고양이");
		System.out.println(blackCat.name);
		
		blackCat.claw(5);
		
		Cat yellowCat = new Cat("yellowCat","시베리아종");
		
		yellowCat.claw(11);
	}

}

class Cat{
	String name;
	String breeds;
	double weight;
	
	public Cat() {name = "하양고양이";}
	public Cat(String name) {
		this.name = name;
	}
	public Cat(String name, String breeds) {
		this.name = name;
		this.breeds = breeds;
	}
	public void claw() {
		System.out.println("할퀴기");
	}
	public void claw(int level) {
		System.out.println(name + "가(이)" + level + "정도로 할퀴기");
	}
}