package com.ttn;
import com.ttn.service.AuthorService;
public class Application {

    public static void main(String[] args) {

         // Question 1 -CRUD on entity class
        AuthorService authorService=new AuthorService();
        authorService.create();
        System.out.println(authorService.read(1));
        authorService.update(2);
        authorService.delete(2);
        authorService.createOneToManyBi();
        authorService.createOneToManyUni();
        authorService.createOneToManyWithoutAdditionalTable();
        authorService.createManyToMany();

    }
}
