package cn.xmg_wolfcode.mybatis.many2many;

import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
	void save(Teacher t);
	void saveRelation(@Param("teaId") Long teaId, 
			          @Param("stuId") Long stuId);
}
