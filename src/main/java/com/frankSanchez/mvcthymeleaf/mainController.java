package com.frankSanchez.mvcthymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class mainController {
	
	@Controller
	public class DemoControler {

		@GetMapping("/")
		public String index(Model modelo) {
			
	
			
			return "index";
		}
	}

}
