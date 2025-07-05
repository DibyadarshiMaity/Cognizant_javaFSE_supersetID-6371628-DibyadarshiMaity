package com.readify.librarymanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.readify.librarymanagement.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>
{
}

