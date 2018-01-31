package com.jd.mybatis.support.service;

import com.jd.mybatis.support.bean.Employee;

import java.util.List;
import java.util.Map;

/**
 * user:hudawei1
 * date:2018/1/29
 * time:13:43
 */
public interface EmployeeService {

    public List<Employee> selectByMinSalary(Map map);
}
