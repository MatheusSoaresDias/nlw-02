package proffy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import proffy.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

	@Query(value = " select m.* from materia m inner join usuario u on m.usuario_id = u.id where m.subject = :subject and exists(select h.* from horario_materia h where h.week_day = :weekDay and h.fromm <= :minutes and h.too > :minutes); ", nativeQuery = true)
	List<Materia> findWithQueries(@Param("subject") String subject, @Param("weekDay") int weekDay, @Param("minutes") int minutes);
}
