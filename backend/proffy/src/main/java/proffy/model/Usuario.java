package proffy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private long id;
	
	@Column(name = "name", unique = true)
	private String name;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "whatsapp", unique = true)
	private String whatsapp;
	
	@Column(name = "bio")
	private String bio;
}
