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

package com.example.usermanagementspringboot.model.dto;

import java.util.Set;

public class UserDto {
    private int id;
    private String userName;
    private String city;
    private Set<FollowsDto> follows;

    public UserDto() {
    }

    public UserDto(int id, String userName, String city,
                   Set<FollowsDto> follows) {
        this.id = id;
        this.userName = userName;
        this.city = city;
        this.follows = follows;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<FollowsDto> getFollows() {
        return follows;
    }

    public void setFollows(Set<FollowsDto> follows) {
        this.follows = follows;
    }
}
