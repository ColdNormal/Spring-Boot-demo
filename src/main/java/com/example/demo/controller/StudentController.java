/**
 * @Package com.example.demo.controller
 * @author atom.hu
 * @date 2025/4/15 16:31
 * @version V1.0
 */
package com.example.demo.controller;

import com.example.demo.Response;
import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Response<StudentDTO> getStudentById(@PathVariable long id){
            return Response.newsuccess(studentService.getStudentById(id));
    }
    @PostMapping("/student")
    public Response<Long> addNewStudent(@RequestBody StudentDTO studentDTO){ //使用注解@RequestBody接收前端的JSON参数，并把其反序列化为一个DTO对象
        //一般需要写校验,但这是速通故省略
        return Response.newsuccess(studentService.addNewStudent(studentDTO));

    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable long id){
        studentService.deleteStudentById(id);
    }

}
