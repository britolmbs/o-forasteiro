package com.forasteiroBarbearia.backend.service;

import com.forasteiroBarbearia.backend.dto.UserDto;
import com.forasteiroBarbearia.backend.model.User;
import com.forasteiroBarbearia.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserDto userDto) {
        if (userDto.getEmail() == null || userDto.getEmail().isEmpty()) {
            throw  new IllegalArgumentException("Email é requerido");
        }
        Optional<User> existingUser = userRepository.findByEmail(userDto.getEmail());
        if(existingUser.isPresent()) {
            throw new IllegalArgumentException(("Usuario já contem email"));
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(userDto.getPassword());

        User newUser = new User();
        newUser.setId(UUID.randomUUID().toString());
        newUser.setName(userDto.getEmail());
        newUser.setPassword(hashedPassword);

        return userRepository.save(newUser);
    }
}
