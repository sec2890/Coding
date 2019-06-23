package Phone;

public interface Ringable {

	public default String ring() {
		return "BUZZZ BUZZZ BUZZZ!";
	}
	public default String unlock() {
		return "Swipe, Phone unlocked!";
	}
	
	
	
}
