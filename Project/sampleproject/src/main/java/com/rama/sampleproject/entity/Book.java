package com.rama.sampleproject.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookName;
    private int bookRating;
    

   /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseid", referencedColumnName ="courseId");

    @ManyToOne
    @JoinTable(name="book_author")
    private List<Author> author;*/
}