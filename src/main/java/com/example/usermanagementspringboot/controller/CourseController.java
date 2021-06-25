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

package com.example.usermanagementspringboot.controller;

import com.example.usermanagementspringboot.model.dto.CourseDto;
import com.example.usermanagementspringboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<String> addCourse(@RequestBody CourseDto courseDto){
        if(courseService.addCourse(courseDto)){
            return ResponseEntity.ok().body("Course successfully created");
        };
        return ResponseEntity.badRequest().body("Course not created");
    }

    @PutMapping("/course")
    public ResponseEntity<String> updateCourse(
            @RequestBody CourseDto courseDto){
        if (courseService.updateCourse(courseDto)){
            return ResponseEntity.ok().body("Course successfully updated");
        };
        return ResponseEntity.badRequest().body("Course not found");
    }

    @DeleteMapping("/course/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable("id") int id){
        if (courseService.deleteCourse(id)){
            return ResponseEntity.ok().body("Course successfully deleted");
        };
        return ResponseEntity.badRequest().body("Course not found");
    }

    @GetMapping("/courses")
    public ResponseEntity<List<CourseDto>> getCourse(){
        return ResponseEntity.ok().body(courseService.getCourses());
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable("id") int id){
        if (courseService.getCourseById(id)!=null) {
            return ResponseEntity.ok().body(courseService.getCourseById(id));
        }
        return ResponseEntity.badRequest().build();
    }
}
