package org.elsys.hotel;

import javax.persistence.*;

@Entity
@Table(name = "cutomer")
public class Customer {
	protected long id;
	protected String name;
	protected long roomId;
	protected String dateCome;
	protected String dateLeave;
	
	public String getDateCome() {
		return dateCome;
	}

	public void setDateCome(String dateCome) {
		this.dateCome = dateCome;
	}

	public String getDateLeave() {
		return dateLeave;
	}

	public void setDateLeave(String dateLeave) {
		this.dateLeave = dateLeave;
	}

	public Customer() {
		super();
	}

	@Id
	@Column(name = "customer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	
	
	
}
