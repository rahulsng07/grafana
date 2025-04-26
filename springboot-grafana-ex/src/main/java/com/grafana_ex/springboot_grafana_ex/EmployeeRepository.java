package com.grafana_ex.springboot_grafana_ex;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
