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

package com.example.usermanagementspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "follows")
public class Follows {
    @Id
    @GeneratedValue
    private int id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    public Follows() {
    }

    public Follows(int id, User user, Course course) {
        this.id = id;
        this.user = user;
        this.course = course;
    }

    public Follows(User user, Course course) {
        this.user = user;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
