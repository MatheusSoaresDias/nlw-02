package proffy.service.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import proffy.model.Conexao;
import proffy.repository.ConexaoRepository;
import proffy.repository.UsuarioRepository;
import proffy.service.ConexaoService;

@Service
public class ConexaoServiceImpl implements ConexaoService {

	@Autowired
	public ConexaoRepository conexaoRepository;
	
	@Autowired
	public UsuarioRepository usuarioRepository;
	
	public ResponseEntity<?> create(Long id) {
		try {
			Conexao conexao = mapper(id);
			
			return ResponseEntity.ok().body(conexaoRepository.save(conexao)); 
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Bad request.");
		}
	}
	
	public ResponseEntity<?> index() {
		try {
			return ResponseEntity.ok().body(conexaoRepository.findAll());
		} catch (Exception e) {			
			return ResponseEntity.badRequest().body("Bad request.");
		}
	}
	
	public Conexao mapper(Long id) {
		Conexao conexao = new Conexao();
		LocalDateTime now = LocalDateTime.now();
		Date date = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		conexao.setTimestamp(date);
		conexao.setUsuarioConn(usuarioRepository.getById(id));
		
		return conexao;
	}
}
