/*
 * (C) Copyright 2010-2021 RUMEX (PRIVATE) LIMITED
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * RUMEX (PRIVATE) LIMITED and constitute a TRADE SECRET
 * of RUMEX (PRIVATE) LIMITED
 *
 * RUMEX (PRIVATE) LIMITED retains all title to and intellectual
 * property rights in these materials.
 */

package com.example.usermanagementspringboot.controller;

import com.example.usermanagementspringboot.model.dto.UserDto;
import com.example.usermanagementspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto){
        if(userService.addUser(userDto)){
            return ResponseEntity.ok().body("User successfully created");
        };
        return ResponseEntity.badRequest().body("User not created");
    }

    @PutMapping("/user")
    public ResponseEntity<String> updateUser(@RequestBody UserDto userDto){
        if (userService.updateUser(userDto)){
            return ResponseEntity.ok().body("User successfully updated");
        };
        return ResponseEntity.badRequest().body("User not found");
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id){
        if (userService.deleteUser(id)){
            return ResponseEntity.ok().body("User successfully deleted");
        };
        return ResponseEntity.badRequest().body("User not found");
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") int id){
        if (userService.getUserById(id)!=null) {
            return ResponseEntity.ok().body(userService.getUserById(id));
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/{userId}/follows/{courseId}")
    public ResponseEntity<String> followCourse(
                                    @PathVariable("userId") int userId,
                                    @PathVariable("courseId") int courseId){
        if (userService.followCourse(userId,courseId)){
            return ResponseEntity.ok().body("User successfully updated");
        };
        return ResponseEntity.badRequest().body("User not found");
    }
}
