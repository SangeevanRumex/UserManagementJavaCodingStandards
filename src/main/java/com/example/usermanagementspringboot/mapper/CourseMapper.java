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

import com.example.usermanagementspringboot.model.Course;
import com.example.usermanagementspringboot.model.dto.CourseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseMapper {
    @Autowired
    private ModelMapper modelMapper;

    public CourseMapper() {
    }

    public CourseMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CourseDto convertToDto(Course course) {
        CourseDto courseDto = modelMapper.map(course, CourseDto.class);

        return courseDto;
    }

    public Course convertFromDto(CourseDto courseDto) {
        Course course = modelMapper.map(courseDto, Course.class);

        return course;
    }
}
