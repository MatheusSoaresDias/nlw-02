package proffy.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConexaoDTO {
	private UsuarioDTO usuarioDto;
	private Date timestamp;
}
