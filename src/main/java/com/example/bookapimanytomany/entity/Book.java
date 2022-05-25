package com.example.bookapimanytomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns =
                    @JoinColumn(
                            name = "book_id",
                            referencedColumnName = "id",
                            foreignKey = @ForeignKey(name = "fk_book_id")
                    ),
            inverseJoinColumns =
                    @JoinColumn(
                            name = "author_id",
                            referencedColumnName = "id",
                            foreignKey = @ForeignKey(name = "fk_author_id")
                    )
    )
    @JsonBackReference
    private List<Author> authors;
}
