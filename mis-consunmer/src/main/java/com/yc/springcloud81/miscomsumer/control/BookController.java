package com.yc.springcloud81.miscomsumer.control;
import com.yc.springcloud81.miscomsumer.bean.Book;
import com.yc.springcloud81.miscomsumer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author liyan
 * @create 2020-10-2020/10/8-16:09
 */
@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("{id}")
    public Book getBook(@PathVariable("id" ) Integer id ){
        return bookService.getBook(id);
    }
}
