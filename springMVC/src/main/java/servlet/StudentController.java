package servlet;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        binder.setValidator(new StudentValidator());
//    }
    
    @GetMapping("/studform")
	public String viewStudentForm(@ModelAttribute Student student) {
//    	try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return "student_reg_form";
	}
    
    @PostMapping("/regstud")
    public String registerStudent(@ModelAttribute Student student, BindingResult result) {
    	student.setId(1);
    	System.out.println("hello2");
    	try {
    		
    		new StudentValidator().validate(student, result );
    		
//    		System.out.println(result.getFieldError());

    		if(result.hasErrors()) {
    			return "student_reg_form";
    		}
    		else {
    			return "student_success_page";
    		}
    		
    	}
    	catch(Exception e) {
    	}
    	
    	return "";
    }
}
