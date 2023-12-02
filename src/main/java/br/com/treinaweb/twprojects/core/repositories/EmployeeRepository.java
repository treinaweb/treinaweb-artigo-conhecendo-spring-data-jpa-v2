package br.com.treinaweb.twprojects.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojects.core.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
