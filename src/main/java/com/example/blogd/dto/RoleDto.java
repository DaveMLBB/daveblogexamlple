package com.example.blogd.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class RoleDto {
    private int id;
    private String name;
}
