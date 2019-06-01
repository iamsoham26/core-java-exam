package org.learn.java;

import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student>, Comparator<Student>{
	//TODO: general - fix the class if there is any issue
	private Integer id;		//!important: id should be auto generated and should not be modifiable
	private String firstName;
	private String lastName;
	private Address mailingAddress;
	private Address permanentAddress;
	//TODO: fix any issue for any instance variable above
	
	public Student(String firstName, String lastName, Address mailingAddress, Address permanentAddress) {
		super();
		id = new Random().nextInt(32);
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailingAddress = mailingAddress;
		this.permanentAddress = permanentAddress;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	

	@Override
	public String toString() {
		return "id= "+ id +", firstName=" + firstName + ", lastName=" + lastName + ", mailingAddress=" + mailingAddress
				+ ", permanentAddress=" + permanentAddress;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mailingAddress == null) ? 0 : mailingAddress.hashCode());
		result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mailingAddress == null) {
			if (other.mailingAddress != null)
				return false;
		} else if (!mailingAddress.equals(other.mailingAddress))
			return false;
		if (permanentAddress == null) {
			if (other.permanentAddress != null)
				return false;
		} else if (!permanentAddress.equals(other.permanentAddress))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.lastName.compareTo(arg0.getLastName());
	}

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		if(arg0.getLastName().equals(arg1.getLastName())){
			return arg0.getFirstName().compareTo(arg1.getFirstName());
		}else if(arg0.getFirstName().equals(arg1.getFirstName())){
			return arg0.permanentAddress.getCity().compareTo(arg1.permanentAddress.getCity());
		}else{
			return arg0.getLastName().compareTo(arg1.getLastName());
		}
		
	}
	
	

	
	

}
