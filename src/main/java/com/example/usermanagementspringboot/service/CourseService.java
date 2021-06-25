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

package com.example.usermanagementspringboot.service;

import com.example.usermanagementspringboot.model.dto.CourseDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CourseService {
    boolean addCourse(CourseDto courseDto);
    boolean updateCourse(CourseDto courseDto);
    boolean deleteCourse(int id);
    List<CourseDto> getCourses();
    CourseDto getCourseById(int id);
}
