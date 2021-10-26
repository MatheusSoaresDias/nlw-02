package proffy.service;

import org.springframework.http.ResponseEntity;

import proffy.dto.MateriaDTO;

public interface MateriaService {

	public ResponseEntity<?> create(MateriaDTO type);

	public ResponseEntity<?> index(String subject, int weekDay, String time);
}
