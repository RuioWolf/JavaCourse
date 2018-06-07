package cn.xmg_wolfcode.mybatis.many2many;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.xmg_wolfcode.mybatis.util.MyBatisUtil;

public class App {
    @Test
    public void testSave() throws Exception {
        SqlSession session = MyBatisUtil.getSession();
        TeacherMapper teaMap = session.getMapper(TeacherMapper.class);
        StudentMapper stuMap = session.getMapper(StudentMapper.class);
        Teacher t1 = new Teacher();
        t1.setName("²¨À½¸ç");
        Teacher t2 = new Teacher();
        t2.setName("Ãæ½î¸ç");
        Student s1 = new Student();
        s1.setName("À×¾ü");
        Student s2 = new Student();
        s2.setName("ÕÅ±¦»ª");
        t1.getStudents().add(s1);
        t1.getStudents().add(s2);
        t2.getStudents().add(s1);
        t2.getStudents().add(s2);
        teaMap.save(t1);
        teaMap.save(t2);
        stuMap.save(s1);
        stuMap.save(s2);
        for(Student s : t1.getStudents()) {
            teaMap.saveRelation(t1.getId(), s.getId());
        }
        for(Student s : t2.getStudents()) {
            teaMap.saveRelation(t2.getId(), s.getId());
        }
        session.commit();
        session.close();
    }
}
