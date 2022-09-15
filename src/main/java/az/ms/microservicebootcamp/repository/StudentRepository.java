package az.ms.microservicebootcamp.repository;

import az.ms.microservicebootcamp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
