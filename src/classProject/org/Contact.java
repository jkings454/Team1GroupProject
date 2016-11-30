/********************************************************
 *
 *  Project :  Java 1410 Class Project
 *  File    :  Contact.java
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

public abstract class Contact {
	
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	

	/**
	 * constructor
	 * @param fName
	 * @param lName
	 * @param address
	 * @param email
	 */
	public Contact(String fName, String lName, String address, String email)
	{
		setFirstName(fName);
		setLastName(lName);
		setAddress(address);
		setEmail(email);	
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String fName) {
		this.firstName = fName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lName) {
		this.lastName = lName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "firstName= " + getFirstName() + ", lastName= " + lastName + 
				", address= " + address + ", email= "+ email;
	}
	
}//end class
