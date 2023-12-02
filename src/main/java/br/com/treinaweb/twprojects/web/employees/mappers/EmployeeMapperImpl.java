package br.com.treinaweb.twprojects.web.employees.mappers;

import org.springframework.stereotype.Component;

import br.com.treinaweb.twprojects.core.models.Employee;
import br.com.treinaweb.twprojects.core.utils.StringUtils;
import br.com.treinaweb.twprojects.web.employees.dtos.EmployeeDetails;
import br.com.treinaweb.twprojects.web.employees.dtos.EmployeeForm;
import br.com.treinaweb.twprojects.web.employees.dtos.EmployeeListItem;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEmployee(EmployeeForm employeeForm) {
        return Employee.builder()
            .name(employeeForm.getName())
            .email(employeeForm.getEmail())
            .phone(StringUtils.cleanPhone(employeeForm.getPhone()))
            .cpf(StringUtils.cleanCpf(employeeForm.getCpf()))
            .birthDate(employeeForm.getBirthDate())
            .hireDate(employeeForm.getHireDate())
            .resignationDate(employeeForm.getResignationDate())
            .build();
    }

    @Override
    public EmployeeForm toEmployeeForm(Employee employee) {
        return EmployeeForm.builder()
            .name(employee.getName())
            .email(employee.getEmail())
            .phone(StringUtils.formatPhone(employee.getPhone()))
            .cpf(StringUtils.formatCpf(employee.getCpf()))
            .birthDate(employee.getBirthDate())
            .hireDate(employee.getHireDate())
            .resignationDate(employee.getResignationDate())
            .build();
    }

    @Override
    public EmployeeListItem toEmployeeListItem(Employee employee) {
        return EmployeeListItem.builder()
            .id(employee.getId())
            .name(employee.getName())
            .email(employee.getEmail())
            .phone(StringUtils.formatPhone(employee.getPhone()))
            .build();
    }

    @Override
    public EmployeeDetails toEmployeeDetails(Employee employee) {
        return EmployeeDetails.builder()
            .name(employee.getName())
            .email(employee.getEmail())
            .phone(StringUtils.formatPhone(employee.getPhone()))
            .cpf(StringUtils.formatCpf(employee.getCpf()))
            .birthDate(employee.getBirthDate())
            .hireDate(employee.getHireDate())
            .resignationDate(employee.getResignationDate())
            .build();
    }
    
}
