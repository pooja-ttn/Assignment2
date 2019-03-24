package com.ttn.entity;

import javax.persistence.*;

@Entity
public class BookManyToOneWithoutTable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String bookName;

    @ManyToOne
    AuthorOneToManyWithoutAdditionalTable author;

    public AuthorOneToManyWithoutAdditionalTable getAuthorOneToManyWithoutAdditionalTable() {
        return author;
    }

    public void setAuthorOneToManyWithoutAdditionalTable(AuthorOneToManyWithoutAdditionalTable author) {
        this.author = author;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}

