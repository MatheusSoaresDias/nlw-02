package proffy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HorarioMateriaDTO {
	private int weekDay;
	private String from;
	private String to;
}
