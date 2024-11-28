package com.microservice.student.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // le decimos a la db que esta clase va a mapearse como una tabla en si, agregaremos su primary key
@Data // genera autom get and set y metodo to string con lombok
@Builder
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")   // la etiqueta column la utilizamos cuando tenemos nombres compuestos como name y lastname
    private String lastName;
    private String email;

    @Column(name = "course_id")
    private Long courseId;

}
