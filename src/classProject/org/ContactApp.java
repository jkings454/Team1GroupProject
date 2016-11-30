package classProject.org;

public class ContactApp {

	public static void main(String[] args) {
		//we have 2 email addresss here
		BusinessContact bc = new BusinessContact("Pink", "Floyd", "3857 Evelyon", 
				"Pink.floyd@pink.com", "PinkFloyd", "888.123.3212", "q@q.com");
		
		FamilyContact famc = new FamilyContact("Joe", "Blow", "1256 ParkCerst", "Q123@123.com", "Dad", "12/12/12");
		FriendContact fric = new FriendContact("Ted", "Nuggent", "3631 Laney", "Ted.nuggent@nuggent.com", "Teddy");
		
		System.out.println("BusinessContact = "+bc.toString());
		System.out.println("FamilyContact = "+famc.toString());
		System.out.println("FriendContact = "+fric.toString());

	}

}
