package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	
	//Serializable interface allows objects to be converted in sequences of bytes and than saved in a file or sent to network
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Department() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	

}
