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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String courseName;
    private int fee;
    private boolean deleted;
    @JsonIgnore
    @OneToMany(targetEntity = Follows.class, fetch = FetchType.LAZY,
                cascade = CascadeType.ALL, mappedBy = "course")
    private Set<Follows> follows = new HashSet<>();

    public Course() {
    }

    public Course(int id, String courseName, int fee, boolean deleted) {
        this.id = id;
        this.courseName = courseName;
        this.fee = fee;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Set<Follows> getFollows() {
        return follows;
    }

    public void setFollows(Set<Follows> follows) {
        this.follows = follows;
    }
}
