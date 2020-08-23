package com.example.demosite.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "id")
    private Category id;
    @OneToMany(mappedBy = "categoryId")
    private Set<Product> products;
    private String name;
    @OneToMany(mappedBy = "id")
    private Set<Category> parentId;

}
