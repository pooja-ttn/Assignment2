package com.ttn.entity;

import javax.persistence.*;


 @Entity
    public class BookManyToOne {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int id;
        private String bookName;

     @ManyToOne
     AuthorOneToManyBi author;

        public AuthorOneToManyBi getAuthor() {
            return author;
        }

        public void setAuthorOneToManyBi(AuthorOneToManyBi author) {
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
