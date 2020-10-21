package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Writer {
	private String firstName;
	private String lastName;
	
	public Writer() {
		super();
	}
	
	public Writer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "Writer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
