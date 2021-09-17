package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>>findAll(){
		List<Client>list = new ArrayList<>();
		list.add(new Client(1L,"Leandro", "111111111111",1300.0, 2));
		list.add(new Client(2L,"Vanessa", "222211111111",1500.0, 1));
		return ResponseEntity.ok().body(list);
		
	}
	
	

}
