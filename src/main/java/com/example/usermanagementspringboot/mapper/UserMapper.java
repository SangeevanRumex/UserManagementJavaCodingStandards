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

package com.example.usermanagementspringboot.mapper;

import com.example.usermanagementspringboot.model.User;
import com.example.usermanagementspringboot.model.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    @Autowired
    private ModelMapper modelMapper;

    public UserMapper() {
    }

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserDto convertToDto(User user)
    {
        UserDto userDto = modelMapper.map(user, UserDto.class);

        return userDto;
    }

    public User convertFromDto(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);

        return user;
    }
}
