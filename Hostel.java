package com.motivity.entities;
import javax.persistence.*;
@Entity
@Table(name = "hostel")
public class Hostel
{

@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
 int HouseNumber;

@Column(name = "name")
protected String name;

@Column(name = "rooms")
protected int rooms;

@Column(name = "fee")
protected int fee;

public Hostel() {}
public Hostel(int HouseNumber, String name, 
              int rooms , int fee) {
  this.HouseNumber = HouseNumber;
  this.name = name;
  this.rooms = rooms;
  this.fee = fee;
}
public class HouseNumber extends Hostel{
		HouseNumber(int HouseNumber){
			 this.HouseNumber = HouseNumber;
		}
}
class Name extends Hostel{
	Name(String name){
		 this.name = name;
	}
}
class Rooms extends Hostel{
	Rooms(int rooms){
		this.rooms = rooms;
	}
}
class Fee extends Hostel{
	Fee(int fee){
		 this.fee = fee;
	}
}
/*
public Hostel(int obj) {
this.obj = obj;
}/*
public Hostel(String name) {
this.name = name;
}
public Hostel(int rooms) {
this.rooms = rooms;
}
public Hostel(int fee) {
this.fee = fee;
}*/
public int getHouseNumber() {
	return HouseNumber;
}


public void setHouseNumber(int houseNumber) {
	HouseNumber = houseNumber;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getRooms() {
	return rooms;
}


public void setRooms(int rooms) {
	this.rooms = rooms;
}


public int getFee() {
	return fee;
}


public void setFee(int fee) {
	this.fee = fee;
}


@Override
public String toString()
{
	return "Hostel [HouseNumber=" + HouseNumber + ", name=" + name
			+ ", rooms=" + rooms + ", fee="
			+ fee + "]";
}

}

