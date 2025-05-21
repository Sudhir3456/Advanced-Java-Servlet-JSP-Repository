package simple_servlet_project.controller.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Student is pojo class
 * 
 * @author Sudhir Kumar
 * 
 */

public class Student implements Serializable {

	private String name;
	private String email;
	private String password;
	private Long phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, name, password, phone);
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
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone + "]";
	}

}