package com.amol.service;

import com.amol.dto.UserDto;
import com.amol.entity.UserEntity;
import com.amol.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = UserEntity.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .mobileNumber(userDto.getMobileNumber())
                .build();
        this.userRepository.save(userEntity);

        return UserDto.builder()
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .email(userEntity.getEmail())
                .mobileNumber(userEntity.getMobileNumber())
                .build();
    }
}
