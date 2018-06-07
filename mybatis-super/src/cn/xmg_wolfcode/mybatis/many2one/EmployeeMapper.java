package cn.xmg_wolfcode.mybatis.many2one;

public interface EmployeeMapper {
	Employee get(Long id);
	
	void save(Employee e);
}
