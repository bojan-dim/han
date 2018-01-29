package org.elsys.hotel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "han_info")
public class Han {
	protected long id;
	protected String name;
	protected String type;
	protected int capacity;
	
	public Han() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
