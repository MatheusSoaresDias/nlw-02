package proffy.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="materia")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "cost")
	private BigDecimal cost;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "materia")
	private List<HorarioMateria> horarioMateria;
	
}
