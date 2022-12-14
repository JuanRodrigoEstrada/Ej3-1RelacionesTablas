package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller;


import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.application.StudentService;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.output.StudentOutputDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetStudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public List<StudentOutputDTO> getAllStudents(){
        return studentService.getALlStudents();
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Object> getStudentById(@PathVariable String id, @RequestParam(defaultValue = "simple") String type) {
        try {
            if (type.equals("simple")){
                return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
            }
            else if (type.equals("full")){
                return new ResponseEntity<>(studentService.getStudentPersona(id), HttpStatus.OK);
            }else {
                return null;
            }
        }
        catch (Exception e){
            return new ResponseEntity<>("No existe el estudiante", HttpStatus.NOT_FOUND);
        }

    }



}
