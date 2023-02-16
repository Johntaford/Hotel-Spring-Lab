package co.grandcircus.springlab;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.hotel.repository.HotelRepository;

@Controller
public class HotelController {

	 @Autowired
	    private HotelRepository repo;

	    @GetMapping("/")
	    public String home() {
	        return "home";
	    }

	    @GetMapping("/search")
	    public String showSearchPage(Model model) {
	        model.addAttribute("cities", new String[]{"New York", "Los Angeles", "Chicago"});
	        return "search";
	    }

	    @PostMapping("/search")
	    public String searchHotels(@RequestParam String city, Model model) {
	        List<Hotel> hotels = repo.findByCityOrderByPricePerNightAsc(city);
	        model.addAttribute("hotels", hotels);
	        return "search-results";
	    }
	}


