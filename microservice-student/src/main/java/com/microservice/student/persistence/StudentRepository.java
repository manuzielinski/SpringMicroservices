package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> { // Student es la clase q maneja y Long el tipo de la clave primaria

    @Query("SELECT s FROM Student AS s WHERE s.courseId = :idCourse")
    List<Student> findAllStudent(Long idCourse);

    List<Student> findAllByCourseId(Long idCourse);
}
