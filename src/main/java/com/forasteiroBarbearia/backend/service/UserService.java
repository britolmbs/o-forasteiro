package com.forasteiroBarbearia.backend.service;

import com.forasteiroBarbearia.backend.dto.UserDto;
import com.forasteiroBarbearia.backend.model.User;
import com.forasteiroBarbearia.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserDto userDto) {
        if (userDto.getEmail() == null || userDto.getEmail().isEmpty()) {
            throw  new IllegalArgumentException("Email é requerido");
        }
    }
}
