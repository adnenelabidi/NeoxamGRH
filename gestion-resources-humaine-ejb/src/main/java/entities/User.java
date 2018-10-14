package entities;

import java.io.Serializable;
import java.lang.String;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;


/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name = "users")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue

	private Long id;
	
    @NotNull
    @Email
    @Column(unique = true)
    //@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."+"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"+"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",message="{invalid.email}")
    protected  String email;
    protected  String login;
    protected  String password;
    
    @Temporal(TemporalType.TIMESTAMP)
    protected  Date registration_date;
	
    @Enumerated(EnumType.STRING)//    @Enumerated(EnumType.ORDINAL) cad dans la bd stock l'index du type de l'enumeration comme entier (int)

	private Role role;
    
    @Enumerated(EnumType.STRING)
	private Status status;
	

	
	
	
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	
	
	
	
	
	public User(String email, String login, String password, Date registration_date) {
		super();
		this.email = email;
		this.login = login;
		this.password = password;
		this.registration_date = registration_date;
	}
	
	





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public Date getRegistration_date() {
		return this.registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", login=" + login + ", password=" + password
				+ ", registration_date=" + registration_date + ", role=" + role + ", status=" + status + "]";
	}
	
	
	
   
}
