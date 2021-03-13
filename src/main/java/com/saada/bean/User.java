/**
 * 
 */
package com.saada.bean;

/**
 * @author sadanand chavan
 *
 * Apr 17, 2020 2:26:02 PM
 */
public class User {

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the passsword
	 */
	public String getPasssword() {
		return passsword;
	}
	/**
	 * @param passsword the passsword to set
	 */
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	/**
	 * @return the cPassword
	 */
	public String getcPassword() {
		return cPassword;
	}
	/**
	 * @param cPassword the cPassword to set
	 */
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
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
	private Long userId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobileNo;
	private String emailAddress;
	private String passsword;
	private String cPassword;
	private String address;

}
