package proffy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import proffy.model.Conexao;
import proffy.service.ConexaoService;

@Controller
public class ConexaoController {

	 @Autowired
	 public ConexaoService conexaoService;
	
	@PostMapping("/conection")
	public ResponseEntity<?> create(@RequestBody Long id) {
		return conexaoService.create(id);
	}
	
	@GetMapping("/conection") 
	public List<Conexao> index() { 
		return null; 
	}
}
