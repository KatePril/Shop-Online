package org.example.app.controllers.employee;

import org.example.app.entities.Employee;
import org.example.app.services.employees.EmployeeCreateService;
import org.example.app.utils.AppStarter;
import org.example.app.views.employees.EmployeeCreateView;

public class EmployeeCreateController {

    EmployeeCreateView view;
    EmployeeCreateService service;

    public EmployeeCreateController(EmployeeCreateView view, EmployeeCreateService service) {
        this.view = view;
        this.service = service;
    }

    public void createEmployee() {
        String[] data = view.getData();
        Employee employee = new Employee();
        employee.setLastName(data[0]);
        employee.setFirstName(data[1]);
        employee.setBirthDate(data[2]);
        employee.setPositionId(Integer.parseInt(data[3]));
        employee.setPhone(data[4]);
        employee.setSalary(Double.parseDouble(data[5]));

        String str = service.createEmployee(employee);
        view.getOutput(str);
        AppStarter.startApp();
    }
}
