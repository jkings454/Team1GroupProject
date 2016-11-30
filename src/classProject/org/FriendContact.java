/********************************************************
 *
 *  Project :  Java 1410 Class Project
 *  File    :  FriendContact.java
 *  Name    :  Jacob McNeal, Joshua Nichols, David Richards
 *  Date    :  12/14/2016
 *
 *  Description : This program helps keep the user Contact information (Business, Family, Friend) in an easy to use
 *  			  program. It lets the user add, delete and update the contact's information,.
 *
 *  Changes :  11/29/2016: Class coding 
 *
 ********************************************************/

package classProject.org;

public class FriendContact extends Contact{
	private String nickName;
	
	public FriendContact(String fName, String lName, String address, String email, String nickName)
	{
		super(fName, lName, address, email);
		setNickName(nickName);
	}

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+" nickName= " + nickName;
	}

}
