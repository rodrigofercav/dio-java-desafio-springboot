package dio.java.desafio.springboot.pilates.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrutorRepository extends CrudRepository<Instrutor, String> {
}
