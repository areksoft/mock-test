package com.test.service.impl;

import com.test.model.response.ResponseDTO;
import com.test.service.ApiService;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * Created by vmishra
 */

@Service("ApiService")
public class ApiServiceImpl implements ApiService {

    final String URI = "https://gorest.co.in/public/v1";

    

    @Override
    public ResponseDTO getUsers() {
       RestTemplate restTemplate = new RestTemplate();
       return restTemplate.getForObject(URI+"/users", ResponseDTO.class);
    }

    @Override
    public ResponseDTO getComments() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URI+"/comments", ResponseDTO.class);
    }

    @Override
    public ResponseDTO getPosts() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URI+"/posts", ResponseDTO.class);
    }

    
}