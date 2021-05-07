package com.asylzhan.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private String genre;
    private boolean booked;

    @Column(name = "library_id")
    private Long libraryId;

    @Column(name = "user_id")
    private Long userId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id" , insertable = false, updatable = false)
    private  User user;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "library_id", insertable = false, updatable = false)
    private Library library;
}
