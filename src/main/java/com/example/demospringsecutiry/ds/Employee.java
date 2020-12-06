package com.example.demospringsecutiry.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Email
@Data
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min = 2,max = 5,message = "code must have length of 2-5 characters")
    @Pattern(regexp = "[A-Za-z-']*",message = "code contain illegal character")
    private int code;

    @NotBlank(message = "first name cannot be empty")
    @Pattern(regexp = "[A-Za-z-']*",message = "first name contain illegal character")
    private String firstName;

    @NotBlank(message = "last name cannot be empty")
    @Pattern(regexp = "[A-Za-z-']*",message = "last name contain illegal character")
    private String lastName;

    @NotBlank(message = "phoneNumber cannot be empty ")
    @Pattern(regexp = "[0-9\\-+]*",message = "phone number contain illegal character")
    private String phoneNumber;

    @NotBlank(message = "address cannot be empty")
    @Pattern(regexp = "[\\w .\\-/,]*",message = "address contain illegal character")
    private String address;

    @NotBlank(message = "cublicNO cannot be empty")
    @Pattern(regexp = "[A-Za-z0-9\\-]*",message = "cublicNO contain illegal character")
    private String cublicNo;

}
