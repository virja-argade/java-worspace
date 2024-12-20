package com.bikkadit.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    private String cityName;

    @ManyToOne
    @JoinColumn(name = "country_id") // Foreign key column in the City table
    private Country country;

    // Getters and Setters
    public int getCityId() {
        return cityId;
    }

    public void setCityId( ) {
        this.cityId =cityId ;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

	
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", country=" + country + "]";
	}

	public City() {
		
	}

	public void setCityId(int i) {
		// TODO Auto-generated method stub
		
	}

	
	

}
