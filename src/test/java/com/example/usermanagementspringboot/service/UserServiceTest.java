/******************************************************************************
 * (C) Copyright 2010-2021 RUMEX (PRIVATE) LIMITED                            *
 * All Rights Reserved.                                                       *
 *                                                                            *
 * These materials are unpublished, proprietary, confidential source code of  *
 * RUMEX (PRIVATE) LIMITED and constitute a TRADE SECRET                      *
 * of RUMEX (PRIVATE) LIMITED                                                 *
 *                                                                            *
 * RUMEX (PRIVATE) LIMITED retains all title to and intellectual              *
 * property rights in these materials.                                        *
 ******************************************************************************/

package com.example.usermanagementspringboot.service;

import com.example.usermanagementspringboot.mapper.UserMapper;
import com.example.usermanagementspringboot.model.User;
import com.example.usermanagementspringboot.model.dto.UserDto;
import com.example.usermanagementspringboot.repository.CourseRepository;
import com.example.usermanagementspringboot.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import static org.assertj.core.api.Assertions.*;

public class UserServiceTest {
    private UserRepository userRepository = Mockito.mock(UserRepository.class);
    private CourseRepository courseRepository = Mockito
                                                .mock(CourseRepository.class);

    ModelMapper modelMapper = new ModelMapper();
    UserMapper userMapper = new UserMapper(modelMapper);
    UserServiceImpl userServiceImpl = new UserServiceImpl(userRepository,
                                                courseRepository, userMapper);

    @Test
    void testGetUserById() {
        User requestedUser = new User(1, "Sangeevan",
                                    "Colombo", false, null);
        UserDto expectedUser = new UserDto(1, "Sangeevan",
                                            "Colombo", null);

        Mockito.when(userRepository.getUserById(1)).thenReturn(requestedUser);

        UserDto responseUser = userServiceImpl.getUserById(1);

        assertThat(responseUser)
                .isEqualToComparingFieldByFieldRecursively(expectedUser);
    }
}