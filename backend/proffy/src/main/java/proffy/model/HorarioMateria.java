package proffy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="horario_materia")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HorarioMateria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="week_day")
	private int weekDay;
	
	@Column(name="fromm")
	private int from;
	
	@Column(name="too")
	private int to;
	
	@ManyToOne
	private Materia materia;
}
