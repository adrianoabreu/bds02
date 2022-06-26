package com.devsuperior.bds02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.services.EventService;

@RestController
@RequestMapping(value = "/events") //annotation que determina a rota do controlador REST
public class EventController {

	@Autowired
	private EventService service;
	
	//ResponseEntity encapsula respostas HTTP
	@PutMapping(value = "/{id}")
	public ResponseEntity<EventDTO> update(@PathVariable Long id, @RequestBody EventDTO dto){		
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}

}
