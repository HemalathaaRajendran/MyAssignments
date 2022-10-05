package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Applied Break");
	}

	public void soundHorn() {
		System.out.println("Soundhorn");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my Car");
		Car audi = new Car();
		audi.applyBreak();
		audi.soundHorn();
		System.out.println("This is my Bike");
		Bike fz = new Bike();
		fz.applyBreak();
		fz.soundHorn();

	}

}
