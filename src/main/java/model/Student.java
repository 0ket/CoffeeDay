package model;

import jakarta.persistence.*;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    
    String email;

    String password;

}
