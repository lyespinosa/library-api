package com.library.demo.entities;

import com.library.demo.entities.pivots.BookGender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "genders")
@Getter @Setter
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "gender")
    private List<BookGender> bookGenders;
}