package com.tds.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tds.Exception.UserNotFoundException;
import com.tds.Model.TdsMaster;
import com.tds.Service.TdsService;


//it will act as a middle layer between view and back end
@RestController
public class HomeController {
	
	//used to link to the service class without creation of objects
	@Autowired
	TdsService tds;
	
	
	
	@GetMapping("/user/tds/{id}")//mapping the url to back end
	public TdsMaster getById(@PathVariable int id) {
		TdsMaster master=tds.getById(id);
		if(master==null) {
			throw new UserNotFoundException("ID Not Found wrong ID "+id);//user defined exception
		}
		else
			return master;
		
	}
}

