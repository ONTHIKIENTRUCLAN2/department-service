package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
//    @Value("${welcome}")
//    String AA;

    @PostMapping
    public Department saveDeparment(@RequestBody Department department){

        return departmentService.saveDeparment(department);
    }

    @GetMapping("/{id}")
//    @Cacheable("order")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){

        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping
    public String helloWorld(){
        return "Hello Vinh nè";
    }
}
