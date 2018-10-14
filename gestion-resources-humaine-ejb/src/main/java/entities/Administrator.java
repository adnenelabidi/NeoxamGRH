package entities;

import entities.Address;
import entities.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity
@Table(name = "admins")
public class Administrator extends User implements Serializable {

	//@NotNull
	//(min=4, max=50)
	private String first_name;
	private String last_name;
	
    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",message="{invalid.phonenumber}")
	private String phone_number;
	
    @Embedded
    @AttributeOverrides(value = {
        @AttributeOverride(name = "addressLine1", column = @Column(name = "house_number")),
        @AttributeOverride(name = "addressLine2", column = @Column(name = "street"))
    })
    private Address address;
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}   
	public String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}   
	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}   
	public String getPhone_number() {
		return this.phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}   
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Administrator [first_name=" + first_name + ", last_name=" + last_name + ", phone_number=" + phone_number
				+ ", address=" + address + ", email=" + email + ", login=" + login + ", password=" + password
				+ ", registration_date=" + registration_date + "]";
	}
	
	
	
   
}
