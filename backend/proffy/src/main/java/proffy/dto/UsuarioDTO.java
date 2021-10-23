package proffy.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioDTO {
	private String name;
	private String avatar;
	private String whatsapp;
	private String bio;
	private List<MateriaDTO> materiaDto;
	private List<ConexaoDTO> conexaoDto;
}
