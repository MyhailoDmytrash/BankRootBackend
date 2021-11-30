package com.lab.application.models.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@Table(name = "categories")
@Entity
@ToString(of = {"user_id", "description", "manipulation_id"})
@NoArgsConstructor
@EqualsAndHashCode()
@AllArgsConstructor
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "categories",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "manipulation_id"))
    private Set<MoneyManipulation> manipulations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
