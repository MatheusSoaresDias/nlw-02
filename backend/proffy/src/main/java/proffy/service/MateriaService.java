package proffy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proffy.model.HorarioMateria;
import proffy.model.Materia;
import proffy.model.Usuario;
import proffy.repository.HorarioMateriaRepository;
import proffy.repository.MateriaRepository;
import proffy.repository.UsuarioRepository;

@Service
public class MateriaService {

	@Autowired
	public MateriaRepository materiaRepository;
	
	@Autowired
	public UsuarioRepository usuarioRepository;
	
	@Autowired
	public HorarioMateriaRepository horarioMateriaRepository;
	
	public void create(Materia materia) {
		Usuario usuario = usuarioRepository.save(materia.getUsuario());
		List<HorarioMateria> arraySaved = new ArrayList<HorarioMateria>();
		for(HorarioMateria horarioMateria : materia.getHorarioMateria()) {			
			 arraySaved.add(horarioMateriaRepository.save(horarioMateria));
		}
		materia.setUsuario(usuario);
		materia.setHorarioMateria(arraySaved);
		materiaRepository.save(materia);
	}
}
