package com.eCommerce.orderapi.Model;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;


@Entity
public class Item {
	@Id
   @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	
	private String Name;
	private String Desc;
	private String price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String name, String desc, String price) {
		super();
		Name = name;
		Desc = desc;
		this.price = price;
	}
	

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", Name=" + Name + ", Desc=" + Desc + ", price=" + price + "]";
	}
	
	

}
