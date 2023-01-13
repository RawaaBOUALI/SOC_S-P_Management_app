package ma.app.studentsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.app.studentsapp.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
