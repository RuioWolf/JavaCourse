package cn.xmg_wolfcode.mybatis.many2one;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.xmg_wolfcode.mybatis.util.MyBatisUtil;

public class App {
    @Test
    public void testGet() throws Exception {
        SqlSession session = MyBatisUtil.getSession();
        EmployeeMapper empMap = session.getMapper(EmployeeMapper.class);
        Employee emp = empMap.get(1L);
        session.commit();
        session.close();
        System.out.println(emp);
        System.out.println(emp.getDept());
    }
    
    @Test
    public void testSave() throws Exception {
        SqlSession s = MyBatisUtil.getSession();
        DepartmentMapper deptMap = s.getMapper(DepartmentMapper.class);
        EmployeeMapper empMap = s.getMapper(EmployeeMapper.class);
        Department dept = new Department();
        dept.setName("¿ª·¢²¿");
        Employee e1 = new Employee();
        e1.setName("Chairman Jiang");
        Employee e2 = new Employee();
        e2.setName("Chairman Xi");
        e1.setDept(dept);
        e2.setDept(dept);
        deptMap.save(dept);
        empMap.save(e1);
        empMap.save(e2);
        s.commit();
        s.close();
    }
}
