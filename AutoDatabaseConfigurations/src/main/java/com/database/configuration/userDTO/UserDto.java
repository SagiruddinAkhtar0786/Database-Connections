package com.database.configuration.userDTO;


public class UserDto {
	private int id;
    private String name;

    public UserDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
