package proffy.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateriaDTO {
	private String subject;
	private BigDecimal cost;
	private UsuarioDTO usuarioDto;
	private List<HorarioMateriaDTO> horarioMateriaDto;
}
