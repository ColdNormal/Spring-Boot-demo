/**
 * @Package com.example.demo.service
 * @author atom.hu
 * @date 2025/4/15 15:13
 * @version V1.0
 */
package com.example.demo.service;

import com.example.demo.converter.StudentConverter;
import com.example.demo.dao.Student;
import com.example.demo.dao.StudentRepository;
import com.example.demo.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public StudentDTO getStudentById(long id) { //Control + i快速新建一个实现方法
        Student student = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        return StudentConverter.convertStudent(student);
    }

    @Override
    public Long addNewStudent(StudentDTO studentDTO) {
        List<Student> studentList = studentRepository.findByEmail(studentDTO.getEmail());
        if(!CollectionUtils.isEmpty(studentList)){
            throw new IllegalStateException("email:"+studentDTO.getEmail()+"has been taken");
        }
        Student student = studentRepository.save(StudentConverter.convertStudent(studentDTO));
        return student.getId();
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id: "+ id + "doesn't exist!"));
        studentRepository.deleteById(id);
    }

}
