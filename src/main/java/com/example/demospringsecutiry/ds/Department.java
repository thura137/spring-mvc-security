package com.example.demospringsecutiry.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min = 2,max = 5,message = "code must have length of 2-5 characters")
    @Pattern(regexp = "[A-Za-z-']*",message = "code contain illegal character")
    private int code;

    @NotBlank(message = " name cannot be empty")
    @Pattern(regexp = "[A-Za-z-']*",message = " name contain illegal character")
    private String name;

    @NotBlank(message = "country cannot be empty")
    @Pattern(regexp = "[A-Za-z-']*",message = "country contain illegal character")
    private String country;

    public Department(){

    }

}
