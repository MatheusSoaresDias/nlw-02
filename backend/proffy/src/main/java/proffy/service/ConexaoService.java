package proffy.service;

import org.springframework.http.ResponseEntity;

public interface ConexaoService {

	public ResponseEntity<?> create(Long id);

	public ResponseEntity<?> index();

}
