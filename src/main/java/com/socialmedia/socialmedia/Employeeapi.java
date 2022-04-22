package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employeeapi {
    @Autowired
    private EmployeeService employeeService;

   @PostMapping(value = "/employee")
   // @RequestMapping(method = RequestMethod.POST, value = "/EMPLOYEE")
    public void addmethod (@RequestBody Employee employee){
            employeeService.addmethod(employee);
        }

    @RequestMapping(method = RequestMethod.GET, value = "/employee")
    public List<Employee> getmethod1() {
        return employeeService.getEmployees();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employee/{employee_id}")
    public Employee getEmployee(@PathVariable("employee_id") String employee_id) {
        return employeeService.getEmployees(employee_id);

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/employee/{employee_id}" )
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("employee_id") String employee_id){
        return employeeService.updateEmployee(employee, employee_id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employee/{employee_id}")
    public void deleteEmployee(@PathVariable("employee_id") String employee_id) {
        employeeService.deleteEmployee(employee_id);


    }

    }
