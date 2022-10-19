package com.library.demo.entities;


import com.library.demo.entities.pivots.AuthorBook;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.LocalTime;

import javax.persistence.*;
;import java.util.List;

@Entity
@Table(name="authors")
@Getter@Setter
public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalTime born;

    private LocalTime died;

    @OneToMany(mappedBy = "author")
    private List<AuthorBook> authorBooks;


}
