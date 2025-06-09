package servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserRegistrationController {
	
	@GetMapping("/userhome")
	public String registerHome() {
		return "user_registration";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user) {

		user.setId(1);

		return "show_user";
	}

	@GetMapping("/oneway")
	public String register(User user) {
		return "bind";
	}

	@GetMapping("/reqparam")
	public String reqparam(@RequestParam(required = true) int sno, @RequestParam("sname") String name) {
		System.out.println(sno + " ...... " + name);
		return "index";
	}
	
	@GetMapping("/dispcountries")
	public String displayAllCountries() {
		return "displaycountries";
	}
	
	@PostMapping("/printcountry")
	public String printCountry(@RequestParam String country, Map<String,Object> map) {
		System.out.println(country);
		map.put("country", country);
		return "printcountry";
	}
	
	@ModelAttribute("countries")
	public List<String> getAllCountries(){
		
		List<String> countries = new ArrayList<>();
		String[] countryCodes = Locale.getISOCountries();

        for (String countryCode : countryCodes) {
            Locale locale = new Locale("", countryCode);
            String countryName = locale.getDisplayCountry();
            countries.add(countryName);
        }
        
        return countries;
	}
}
