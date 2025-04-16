/**
 * @Package com.example.demo.converter
 * @author atom.hu
 * @date 2025/4/15 17:06
 * @version V1.0
 */
package com.example.demo.converter;

import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDTO;

public class StudentConverter {
    public static StudentDTO convertStudent(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setName(student.getName());
        return studentDTO;
    }

    public static Student convertStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setEmail(studentDTO.getEmail());
        student.setName(studentDTO.getName());
        return student;
    }
}
