package com.spring.jpa.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.bean.EmployeeBean;

public interface EmployeeSpringRepository  extends JpaRepository<EmployeeBean, Integer>{

}
 