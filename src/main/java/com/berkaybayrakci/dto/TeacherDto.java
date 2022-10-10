package com.berkaybayrakci.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "You cannot leave the Name and Surname field blank...")
    @Size(min=1,max=255)
    private String teacherNameSurname;

    @NotEmpty(message = "You cannot leave the e-mail field blank...")
    @Email(message = "You have not entered an e-mail in the appropriate format")
    private String teacherEmail;

    @NotEmpty(message = "You cannot leave the password field blank...")
    @Size(min=10,max=18)
    private String teacherPassword;

}
