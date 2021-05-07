package com.asylzhan.spring.repo;

import com.asylzhan.spring.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepo extends JpaRepository<Library,Long> {
    @Override
    List<Library> findAll();

    List<Library> findAllByNameOrAddress(String name, String address);

    Library findByNameOrAddress(String name , String address);

    Library findById(long id);
}
