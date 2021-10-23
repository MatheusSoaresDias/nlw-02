package proffy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import proffy.dto.MateriaDTO;
import proffy.service.MateriaService;

@Controller
public class MateriaController {

	@Autowired
	public MateriaService materiaService;
	
	@PostMapping("/classes")
	public @ResponseStatus(value = HttpStatus.CREATED) void create(@RequestBody MateriaDTO materiaDto) {
		materiaService.create(materiaDto);
	}
}
