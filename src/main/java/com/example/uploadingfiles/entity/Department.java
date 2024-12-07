package com.example.uploadingfiles.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "department_2")
@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    
    @Column(name = "surname")
    private String surname;
    
    @Column(name = "file_name")
    private String file_name;
}

