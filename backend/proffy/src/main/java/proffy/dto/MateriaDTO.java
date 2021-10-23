package proffy.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proffy.model.HorarioMateria;
import proffy.model.Usuario;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateriaDTO {
	private String subject;
	private BigDecimal cost;
	private Usuario usuario;
	private List<HorarioMateria> horarioMateria;
}
