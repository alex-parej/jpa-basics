package com.arnoldgalovics.jpa.service;

import com.arnoldgalovics.jpa.repository.domain.Book;
import com.arnoldgalovics.jpa.repository.domain.Genre;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class BookService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void insert(){
        Book book = new Book("name",19.1f,144,"abcde", Genre.HORROR);
        em.persist(book);
        em.flush();
        System.out.println("after persist");
    }
}
