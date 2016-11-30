/********************************************************
 *
 *  Project :  Java 1410 Class Project
 *  File    :  FamilyContact.java
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

public class FamilyContact extends Contact{
	private String relationShip;
	private String birthDay;
	
	public FamilyContact(String fName, String lName, String address, String email,String relationShip, String birthDay)
	{
		super(fName, lName, address, email);
		setRelationShip(relationShip);
		setBirthDay(birthDay);
	}

	/**
	 * @return the relationShip
	 */
	public String getRelationShip() {
		return relationShip;
	}

	/**
	 * @param relationShip the relationShip to set
	 */
	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+" relationShip= " + getRelationShip() + ", birthDay= " + getBirthDay();
	}

}
