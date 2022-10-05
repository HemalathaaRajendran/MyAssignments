package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Applied Break");
	}

	public void soundHorn() {
		System.out.println("Soundhorn");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my car");
		Car audi = new Car();
		audi.applyBreak();
		audi.soundHorn();

	}

}
