package com.test.controller;
import com.test.model.response.ResponseDTO;
import com.test.service.ApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vmishra
 */

@RestController
public class PublicApi {
    
    @Autowired
    ApiService service;

    @GetMapping(value = "/get-users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getUsers() {
        ResponseDTO obj = service.getUsers();
        return ResponseEntity.status(HttpStatus.OK).body(obj);
    }

    @GetMapping(value = "/get-posts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getPosts() {
        ResponseDTO obj = service.getPosts();
        return ResponseEntity.status(HttpStatus.OK).body(obj);
    }

    @GetMapping(value = "/get-comments", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getComments() {
        ResponseDTO obj = service.getPosts();
        return ResponseEntity.status(HttpStatus.OK).body(obj);
    }
    
}