package proffy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proffy.dto.HorarioMateriaDTO;
import proffy.dto.MateriaDTO;
import proffy.model.HorarioMateria;
import proffy.model.Materia;
import proffy.model.Usuario;
import proffy.repository.HorarioMateriaRepository;
import proffy.repository.MateriaRepository;
import proffy.repository.UsuarioRepository;
import proffy.service.MateriaService;

@Service
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	public MateriaRepository materiaRepository;
	
	@Autowired
	public UsuarioRepository usuarioRepository;
	
	@Autowired
	public HorarioMateriaRepository horarioMateriaRepository;
	
	public void create(MateriaDTO type) {
		Materia materia = mapper(type);
		usuarioRepository.save(materia.getUsuario());
		
		for(HorarioMateria horarioMateria : materia.getHorarioMateria()) {
			horarioMateriaRepository.save(horarioMateria);
		}
		
		materiaRepository.save(materia);
	}
	
	private Materia mapper(MateriaDTO type) {
		Materia materia = new Materia();
		Usuario usuario = new Usuario();
		List<HorarioMateria> horario = new ArrayList<>();
		materia.setSubject(type.getSubject());
		materia.setCost(type.getCost());
		materia.setUsuario(usuario);
		materia.getUsuario().setName(type.getUsuarioDto().getName());
		materia.getUsuario().setAvatar(type.getUsuarioDto().getAvatar());
		materia.getUsuario().setWhatsapp(type.getUsuarioDto().getWhatsapp());
		materia.getUsuario().setBio(type.getUsuarioDto().getBio());
		materia.setHorarioMateria(horario);
		for(HorarioMateriaDTO horarioMateria : type.getHorarioMateriaDto()) {
			HorarioMateria horarioMateriaEntity = new HorarioMateria();
			horarioMateriaEntity.setWeekDay(horarioMateria.getWeekDay());
			horarioMateriaEntity.setFrom(makeFromAndTo(horarioMateria.getFrom()));
			horarioMateriaEntity.setTo(makeFromAndTo(horarioMateria.getTo()));
			materia.getHorarioMateria().add(horarioMateriaEntity);
		}
		
		return materia;
	}
	
	public int makeFromAndTo(String number) {
		String[] arr = number.split(":");
		int numberConverted = 0;
		
		numberConverted = Integer.parseInt(arr[0]) * 60;
		numberConverted += Integer.parseInt(arr[1]);
		
		return numberConverted;
	}
}
