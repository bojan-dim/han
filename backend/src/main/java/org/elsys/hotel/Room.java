package org.elsys.hotel;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {
	private long id;
	private long num;
	private long price;
	private String name;
	private Boolean taken;
	private Boolean clean;
	
	public Room() {
		super();
	}
	
	@Id
	@Column(name = "rooms")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public Boolean getTaken() {
		return taken;
	}
	public void setTaken(Boolean taken) {
		this.taken = taken;
	}
	public Boolean getClean() {
		return clean;
	}
	public void setClean(Boolean clean) {
		this.clean = clean;
	}
	
}
