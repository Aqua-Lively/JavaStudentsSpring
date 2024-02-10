package ru.kors.springstudents.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.StudentService;

import java.util.List;


@RestController // Если мы хотим рест фулл веб сайт.
// Наследуется от контроллера и содержится аннотацию респонс бади, что означает автоматическую
// сериализацию в json любого возвращаемого объекта
@RequestMapping("/api/v1/students") // принимает строку в качестве параментра
@AllArgsConstructor
public class StudentController {

    private final StudentService service;
    @GetMapping
    public List<Student> findAllStudent() {
        //todo
        return service.findAllStudent();
    }
    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findaByEmail(@PathVariable String email){
        return service. findByEmail(email);
    }
    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
