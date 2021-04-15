package pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class home {

	  @RequestMapping("/home1")
	  //@Mapping("home1")
	  public String method1() 
	    {
		
		System.out.println("this is method===========================================");
		
		return "page1";
	
		}
}
