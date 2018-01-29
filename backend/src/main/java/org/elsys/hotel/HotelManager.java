package org.elsys.hotel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HotelManager {

	 protected SessionFactory sessionFactory;
	 
	    protected void setup() {
	    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
	        .configure()
	        .build();
			try {
			    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			} catch (Exception ex) {
			    StandardServiceRegistryBuilder.destroy(registry);
			}   
	    }
	 
	    protected void exit() {
	    	sessionFactory.close();
	    }
	 
	    //CREATE functions
	    protected void create_employee(int id, String name, int salary, String position) {
	    	
	    	Employee e = new Employee();
	    	e.setId(id);
	    	e.setName(name);
	    	e.setSalary(salary);
	    	e.setPosition(position);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	s.save(e);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    protected void create_room(int id, int num, String name, Boolean taken, Boolean clean, int price) {
	    	Room r = new Room();
	    	r.setId(id);
	    	r.setNum(num);
	    	r.setName(name);
	    	r.setTaken(taken);
	    	r.setClean(clean);
	    	r.setPrice(price);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	s.save(r);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    protected void create_customer(int id, String name, int roomId, String dateCome, String dateLeave) {
	    	Customer c = new Customer();
	    	c.setId(id);
	    	c.setRoomId(roomId);
	    	c.setName(name);
	    	c.setDateCome(dateCome);
	    	c.setDateLeave(dateLeave);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	s.save(c);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    protected void create_han(int id, int capacity, String name, String type) {
	    	Han h = new Han();
	    	h.setId(id);
	    	h.setCapacity(capacity);
	    	h.setName(name);
	    	h.setType(type);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	s.save(h);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    //READ functions
	    
	    protected void read_employee(int id) {
	    	Session s = sessionFactory.openSession();
	    	
	    	Employee e = s.get(Employee.class, id);
	    	
	    	System.out.println("id:" + e.getId());
	    	System.out.println("name:" + e.getName());
	    	System.out.println("salary:" + e.getSalary());
	    	System.out.println("position:" + e.getPosition());
	    	
	    	s.close();
	    }	
	    
	    protected void read_customer(int id) {
	    	Session s = sessionFactory.openSession();
	    	
	    	Customer c = s.get(Customer.class, id);
	    	
	    	System.out.println("id:" + c.getId());
	    	System.out.println("name:" + c.getName());
	    	System.out.println("roomID:" + c.getRoomId());
	    	System.out.println("dateCome:" + c.getDateCome());
	    	System.out.println("dateLeave:" + c.getDateLeave());
	    	
	    	s.close();
	    }
	    
	    protected void read_room(int id) {
	    	Session s = sessionFactory.openSession();
	    	
	    	Room r = s.get(Room.class, id);
	    	
	    	System.out.println("id:" + r.getId());
	    	System.out.println("num:" + r.getNum());
	    	System.out.println("price" + r.getPrice());
	    	System.out.println("name:" + r.getName());
	    	System.out.println("taken:" + r.getTaken());
	    	System.out.println("clean:" + r.getClean());
	    	
	    	s.close();
	    }
	    
	    protected void read_han(int id) {
	    	Session s = sessionFactory.openSession();
	    	
	    	Han h = s.get(Han.class, id);
	    	
	    	System.out.println("id" + h.getId());
	    	System.out.println("name" + h.getName());
	    	System.out.println("type" + h.getType());
	    	System.out.println("capacity" + h.getCapacity());
	    	
	    	s.close();
	    	
	    }
	   
	    //UPDATE functions
	    protected void update_employee(int id, String name, int salary, String position) {
	    	Employee e = new Employee();
	    	e.setId(id);
	    	e.setName(name);
	    	e.setSalary(salary);
	    	e.setPosition(position);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.update(e);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    protected void update_customer(int id, String name, int roomId, String dateCome, String dateLeave) {
	    	Customer c = new Customer();
	    	c.setId(id);
	    	c.setName(name);
	    	c.setRoomId(roomId);
	    	c.setDateCome(dateCome);
	    	c.setDateLeave(dateLeave);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.update(c);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    	
	    }
	    
	    protected void update_room(int id, int num, int price, String name, Boolean taken, Boolean clean) {
	    	Room r = new Room();
	    	r.setId(id);
	    	r.setPrice(price);
	    	r.setNum(num);
	    	r.setName(name);
	    	r.setTaken(taken);
	    	r.setClean(clean);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.update(r);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    	
	    }
	    
	    protected void update_han(int id, String name, String type, int capacity) {
	    	Han h = new Han();
	    	h.setId(id);
	    	h.setName(name);
	    	h.setType(type);
	    	h.setCapacity(capacity);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.update(h);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    //DELETE functions
	    protected void delete_employee(int id) {
	    	Employee e = new Employee();
	    	e.setId(id);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.delete(e);
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    protected void delete_customer(int id) {
	    	
	    	Customer c = new Customer();
	    	c.setId(id);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.update(c);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    protected void delete_room(int id) {
	    	Room r = new Room();
	    	r.setId(id);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.update(r);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	    protected void delete_han(int id) {
	    	Han h = new Han();
	    	h.setId(id);
	    	
	    	Session s = sessionFactory.openSession();
	    	s.beginTransaction();
	    	
	    	s.update(h);
	    	
	    	s.getTransaction().commit();
	    	s.close();
	    }
	    
	//MAIN function    
	public static void main(String[] args) {
		HotelManager mng = new HotelManager();
		
		mng.setup();
		
		mng.exit();
	}

}
