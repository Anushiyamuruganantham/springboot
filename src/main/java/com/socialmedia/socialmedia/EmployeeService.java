package com.socialmedia.socialmedia;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<Employee>();

    public void addmethod(Employee employee){
       employees.add(employee); }
    public List<Employee> getEmployees() {
        return employees;
    }
    public Employee getEmployees(@PathVariable("employee_id") String employee_id) {
        Employee resp = null;
        for (Employee employee : employees) {
            if (employee.getId().equals(employee_id)) {
                resp = employee;
                break;
            }
        }
        return resp;
    }
    public Employee updateEmployee( Employee employee, String employee_id) {
        Employee response = null;
        for (Employee employee_obj : employees) {
            if (employee_obj.getId().equals(employee_id)) {
                employee_obj.setFirstname(employee.getFirstname());
                employee_obj.setLastname(employee.getLastname());
                employee_obj.setEmail(employee.getEmail());
                response=employee_obj;
                break;
            }
        }

        return response;}
    public void deleteEmployee(@PathVariable("employee_id") String employee_id){
        List<Employee> new_employees_list = new ArrayList<Employee>();
        for (Employee employee: employees) {
            if(!employee.getId().equals(employee_id)){
                new_employees_list.add(employee);
            }
        }
        employees= new_employees_list;
    }

}
