package com.github.gwtboot.sample.basic.server.controller;

import com.github.gwtboot.sample.basic.server.Employee;
import com.google.gwt.core.client.JsonUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ButtonController {

    @GetMapping("/goodbye")
    public Employee getAllEmployees() {
        Employee employee = new Employee("This is me, bro!");
        return employee;
    }
}
