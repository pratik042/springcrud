package pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {

	@RequestMapping("/home")
	public String method1() {
		
		System.out.println("this is method===========================================");
		return "page1";
	}
}
