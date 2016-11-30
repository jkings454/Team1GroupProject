/********************************************************
 *
 *  Project :  Java 1410 Class Project
 *  File    :  BusinessContact.java
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

public class BusinessContact extends Contact{

	private String compName;
	private String compPhone;
	private String compEmail;
	
	public BusinessContact(String fName, String lName, String address, String email,
			String compName, String compPhone, String compEmail)
	{
		super(fName, lName, address, email);
		setCompName(compName);
		setCompPhone(compPhone);
		setCompEmail(compEmail);	
	}

	/**
	 * @return the compName
	 */
	public String getCompName() {
		return compName;
	}

	/**
	 * @param compName the compName to set
	 */
	public void setCompName(String compName) {
		this.compName = compName;
	}

	/**
	 * @return the compPhone
	 */
	public String getCompPhone() {
		return compPhone;
	}

	/**
	 * @param compPhone the compPhone to set
	 */
	public void setCompPhone(String compPhone) {
		this.compPhone = compPhone;
	}

	/**
	 * @return the compEmail
	 */
	public String getCompEmail() {
		return compEmail;
	}

	/**
	 * @param compEmail the compEmail to set
	 */
	public void setCompEmail(String compEmail) {
		this.compEmail = compEmail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+" compName= " + compName + ", compPhone= " + compPhone + 
				", compEmail= " + compEmail;
	}

}
