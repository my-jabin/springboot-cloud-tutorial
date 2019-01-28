package com.jiujiu.springboot.ratingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName BookServiceClient
 * @AuThor yanbin.hu
 * @Date 1/28/2019
 * @Description
 **/
@FeignClient("book-service")
public interface BookServiceClient {

    // make request to ${book-service}/books/{id}
    @GetMapping("/books/{id}")
    String getBookById(@PathVariable Long id);
}