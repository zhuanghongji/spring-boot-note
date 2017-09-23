package com.zhuanghongji.spring.boot.note.readinglist.repository;

import com.zhuanghongji.spring.boot.note.readinglist.bean.Book;
import com.zhuanghongji.spring.boot.note.readinglist.bean.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long>{

    List<Book> findByReader(Reader reader);

}
