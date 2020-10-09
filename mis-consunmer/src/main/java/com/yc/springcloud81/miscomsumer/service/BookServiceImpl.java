package com.yc.springcloud81.miscomsumer.service;

import com.yc.springcloud81.miscomsumer.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



/**
 * @author liyan
 * @create 2020-10-2020/10/8-16:09
 */
@Service
public class BookServiceImpl implements  BookService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Book getBook(Integer id) {
        //远程调用mis-provider中的服务逻辑.
        //   这里采用通用服务名来自动查找这个服务名下的服务列表，并通过ribbon实现自动负载均衡.
        Book book=restTemplate.getForObject("http://application/book/"+id,Book.class);
        return book;
    }
}
