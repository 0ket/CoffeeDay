package model;

import jakarta.persistence.*;

@Entity
public class Curse {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    

}
