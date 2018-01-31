package com.jd.mybatis.main;

import com.jd.mybatis.support.bean.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * user:hudawei1
 * date:2018/1/18
 * time:14:57
 */
public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("=======start=======");
                /*
         * 1.加载mybatis的配置文件，初始化mybatis，创建出SqlSessionFactory，是创建SqlSession的工厂
         * 这里只是为了演示的需要，SqlSessionFactory临时创建出来，在实际的使用中，SqlSessionFactory只需要创建一次，当作单例来使用
         */
        InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);

        //2. 从SqlSession工厂 SqlSessionFactory中创建一个SqlSession，进行数据库操作
        SqlSession sqlSession = factory.openSession();

        //3.使用SqlSession查询
        Map<String,Object> params = new HashMap<String,Object>();
        int salary = 10000;
        params.put("min_salary",salary);
        //a.查询工资低于10000的员工
        List<Employee> result = sqlSession.selectList("EmployeesMapper.selectByMinSalary",params);
        //b.未传最低工资，查所有员工
//        List<Employee> result1 = sqlSession.selectList("EmployeesMapper.selectByMinSalary");
        System.out.println("薪资低于"+salary+"的员工数："+result.size());
        //~output :   查询到的数据总数：5
//        System.out.println("所有员工数: "+result1.size());


    }












}
