package com.zhuanghongji.spring.boot.note.readinglist.repository;

import com.zhuanghongji.spring.boot.note.readinglist.bean.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

// TODO 第二个为什么是 String ? Serializable ?
public interface ReaderRepository extends JpaRepository<Reader, String> {

    // nothing

}
