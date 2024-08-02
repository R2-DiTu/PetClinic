package com.example.petClinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petClinic.model.Pets;
import com.example.petClinic.model.Response;

@RestController
@RequestMapping(path= "/app")
public class AppController {
	
	@GetMapping (path= "/welcome")
	public String welcome() {
		return "<h3>Welcome to the Pet Clinic!</h3>";
	}
	
	@GetMapping(path= "/pets")
	public Response getPets() {
		
		List<Pets> petList = new ArrayList<Pets>();
		petList.add(new Pets(101, "Simon", "Cat", "Eric T."));
		petList.add(new Pets(102, "Itchi", "Cat", "Victoria R."));
		petList.add(new Pets(103, "Pepper", "Dog", "Suzanne R."));
		petList.add(new Pets(104, "Data", "Iguana", "Melinda W."));
		
		Response response = new Response(101, "Pets Fetched Successfully", petList);
		return response;
		
	}
	
	
	
}//END of main class
