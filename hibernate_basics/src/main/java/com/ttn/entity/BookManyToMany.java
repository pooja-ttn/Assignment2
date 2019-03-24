package com.ttn.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class BookManyToMany {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int id;
        private String bookName;



    @ManyToMany(mappedBy = "book")
        Collection<AuthorManyToMany> authorManyToMany=new HashSet<>();

    public Collection<AuthorManyToMany> getAuthorManyToMany() {
        return authorManyToMany;
    }

    public void setAuthorManyToMany(Collection<AuthorManyToMany> authorManyToMany) {
        this.authorManyToMany = authorManyToMany;
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
