package com.portfolio.portfolio.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name="projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String description;


}
