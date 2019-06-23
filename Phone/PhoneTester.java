package Phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s10 = new Galaxy("S10", 89, "AT&T", "Beep Beep Boop!");
		IPhone iPhoneS = new IPhone("S", 92, "Sprint", "Ring Ring!");
		
		s10.displayInfo();
		System.out.println(s10.ring());
		System.out.println(s10.unlock());
		
		iPhoneS.displayInfo();
		System.out.println(iPhoneS.ring());
		System.out.println(iPhoneS.unlock());
	}

}
