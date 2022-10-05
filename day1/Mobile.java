package week1.day1;

public class Mobile {

	public void makeCall(String mobileModel, float mobileweight) {
		System.out.println("mobile model is " + mobileModel);
		System.out.println("mobile weight is " + mobileweight);
	}

	public void sendMsg(boolean isFullCharged, int mobileCost) {
		System.out.println("my mobile cost is " + mobileCost);
		System.out.println("my mobile fullycharged is " + isFullCharged);

	}

	public static void main(String[] args) {
		Mobile myobj = new Mobile();
		myobj.makeCall("Redmi", 1.437f);
		myobj.sendMsg(false, 17000);
		System.out.println("This is my Mobile");

	}
}
