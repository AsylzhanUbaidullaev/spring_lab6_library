package com.asylzhan.spring.conroller;

import com.asylzhan.spring.entity.Library;
import com.asylzhan.spring.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("")
    public List<Library> getAllLibraries(){
        return libraryService.getAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        libraryService.delete(id);
    }

    @GetMapping("/{id}")
    public Library getById(@PathVariable Long id){
        return libraryService.findById(id);
    }

    @PostMapping("/create")
    public Library createLibrary(@RequestBody Library library){
        return libraryService.create(library);
    }
}
