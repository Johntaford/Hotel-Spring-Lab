package co.grandcircus.springlab;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import co.grandcircus.hotel.repository.HotelRepository;

@Entity
@Table(name = "hotel")
public class Hotel {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "hotel_name")
	    private String name;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "price_per_night")
	    private Integer pricePerNight;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public Integer getPricePerNight() {
	        return pricePerNight;
	    }

	    public void setPricePerNight(Integer pricePerNight) {
	        this.pricePerNight = pricePerNight;
	    }
	    
}


