package com.asylzhan.spring.service;

import com.asylzhan.spring.entity.Library;

import java.util.List;

public interface LibraryService {
    Library create(Library library);
    Library update(Library library);
    void delete(Long id);
    List<Library> getAll();
    List<Library> findAllByNameOrAddress(String name, String address);

    Library findById(long id);
}
