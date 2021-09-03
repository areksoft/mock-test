package com.test.service;

import com.test.model.response.ResponseDTO;

/**
 * Created by vmishra
 */

public interface ApiService {
    
    ResponseDTO getUsers();

    ResponseDTO getComments();

    ResponseDTO getPosts();
}