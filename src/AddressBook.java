import java.util.*;

public class AddressBook {
	
    private Map<String, BuddyInfo> buddyCollection;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void addBuddy(String name, String address, String phone) {
    	BuddyInfo add = new BuddyInfo(name, address, phone);
    	buddyCollection.put(name, add);
    	
    }
    
    public void removeBuddy(String key) {
    	buddyCollection.remove(key);
    }

}
