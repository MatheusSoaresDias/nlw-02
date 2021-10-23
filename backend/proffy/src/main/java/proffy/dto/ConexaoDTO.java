package proffy.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proffy.model.Usuario;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConexaoDTO {
	private Usuario usuario;
	private Date timestamp;
}
