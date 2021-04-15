package pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {

	
	
	@RequestMapping("/home1")
	public String homemethod()
	{
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiii");
		return "page1";
		
	}

	
}
