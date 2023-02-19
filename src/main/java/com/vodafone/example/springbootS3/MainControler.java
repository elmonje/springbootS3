package com.vodafone.example.springbootS3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@RestController
public class MainControler {
	
	@GetMapping("/Prueba")
	public String showHomePage() 
	{
		return "upload";
	}
	
	@GetMapping("/Starter")
	public String SpringStarter()
	{
        Date date = new Date();
		return "At the moment:" + date + " <h1>Prueba funciona</h1>";
	}	
}
