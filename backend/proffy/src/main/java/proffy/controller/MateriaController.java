package proffy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import proffy.dto.MateriaDTO;
import proffy.service.MateriaService;

@Controller
public class MateriaController {

	@Autowired
	public MateriaService materiaService;
	
	@PostMapping("/classes")
	public ResponseEntity<?> create(@RequestBody MateriaDTO materiaDto) {
		return materiaService.create(materiaDto);
	}
	
	@GetMapping("/classes")
	public ResponseEntity<?> index(@RequestParam String subject, @RequestParam int weekDay, @RequestParam String time) {
		return materiaService.index(subject, weekDay, time);
	}
}
