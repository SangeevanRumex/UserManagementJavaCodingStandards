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

package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    boolean addUser(UserDto userDto);
    boolean updateUser(UserDto userDto);
    boolean deleteUser(int id);
    List<UserDto> getUsers();
    UserDto getUserById(int id);
    boolean followCourse(int userId, int courseId);
}
