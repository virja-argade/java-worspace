package com.bikkadit.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class address {
private String city;
private String state;
private String zip;
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the zip
 */
public String getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
}

@Override
public String toString() {
	return "address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
}

public address() {
	
	
}

}
