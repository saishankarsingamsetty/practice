package servlet;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestControllerPractice {

	@RequestMapping("/getdataandtime")
	@ResponseBody
	public String getDateAndTime() {
		return LocalDateTime.now().toString();
	}
	
	
	@GetMapping("/dateandtime")
	public String dateAndTime() {
		return "dateandtime";
	}
	
}
