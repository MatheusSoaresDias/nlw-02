package proffy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proffy.service.ConexaoService;

@CrossOrigin("http://localhost:3000")
@Controller
public class ConexaoController {

	 @Autowired
	 public ConexaoService conexaoService;
	
	@PostMapping("/conection")
	public ResponseEntity<?> create(@RequestParam("id") long id) {
		return conexaoService.create(id);
		
	}
	
	@GetMapping("/conection") 
	public ResponseEntity<?> index() { 
		return conexaoService.index(); 
	}
}
