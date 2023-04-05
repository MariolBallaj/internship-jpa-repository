package com.lhind.service.impl;

import com.lhind.mapper.EmployeeMapper;
import com.lhind.model.dto.EmployeeDTO;
import com.lhind.repository.impl.EmployeeRepositoryImpl;
import com.lhind.service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl() {
        this.employeeRepository = new EmployeeRepositoryImpl();
        this.employeeMapper = new EmployeeMapper();
    }

    @Override
    public List<EmployeeDTO> loadAllEmployees() {
        return employeeRepository.findAll().stream().map(employeeMapper::toDto).collect(Collectors.toList());
    }

}
