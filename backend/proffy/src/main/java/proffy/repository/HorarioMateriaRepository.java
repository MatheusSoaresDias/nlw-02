package proffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proffy.model.HorarioMateria;

@Repository
public interface HorarioMateriaRepository extends JpaRepository<HorarioMateria, Long> {

}
