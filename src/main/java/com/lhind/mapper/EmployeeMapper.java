package com.lhind.mapper;

import com.lhind.model.dto.EmployeeDTO;
import com.lhind.model.entity.Employee;

public class EmployeeMapper extends AbstractMapper<Employee, EmployeeDTO> {

    @Override
    public Employee toEntity(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public EmployeeDTO toDto(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setMiddleName(employee.getMiddleName());
        employeeDTO.setEmploymentStatus(employee.getEmploymentStatus());
        employeeDTO.setUsername(employee.getUsername());
        employeeDTO.setEmploymentDate(employee.getEmploymentDate());
        return employeeDTO;
    }

}
