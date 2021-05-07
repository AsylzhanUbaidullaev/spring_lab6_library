package com.asylzhan.spring.conroller;

import com.asylzhan.spring.entity.Book;
import com.asylzhan.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") Long id){
        return bookService.findById(id);
    }

    @GetMapping("/find")
    public List<Book> getBookByNameAndGenre(@RequestParam("name") String name,
                                            @RequestParam("genre") String genre){
        return bookService.findAllByNameOrAuthorAnd(name,genre);
    }

    @GetMapping("/user/{id}")
    public List<Book> getAllBooks(@PathVariable("id") Long userId){
        return bookService.findAllByUserId(userId);
    }

    @GetMapping("/library/{id}")
    public List<Book> getBookOfLibraries(@PathVariable("id") Long libraryId){
        return bookService.findAllByLibrary(libraryId);
    }

    @PostMapping("")
    public Book createBook(@RequestBody Book book){
        return bookService.create(book);
    }

    @PatchMapping("/assignBookToUser")
    public Book updateAssignBookToUser(@RequestParam Long id,
                                       @RequestParam Long userID){
        return bookService.assignBookToUser(id,userID);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
    @PatchMapping
    public Book updateAssignBookToLibrary(@RequestParam Long id,
                                          @RequestParam Long libID){
        return  bookService.assignBookToLibrary(id,libID);
    }
}
