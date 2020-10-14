import com.wildchap.dao.StudentMapper;
import com.wildchap.dao.TeacherMapper;
import com.wildchap.pojo.Student;
import com.wildchap.pojo.Teacher;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void testAllStudent(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> allStudent = mapper.getAllStudent();

        for (Student student : allStudent) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testStudent(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Student student = mapper.getStudentById(1);

        System.out.println(student);

        sqlSession.close();
    }

    @Test
    public void testAllTeacher(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> allTeacher = mapper.getAllTeacher();

        for (Teacher teacher : allTeacher) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void testTeacher(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacherById(1);

        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void testStudentAndTeacher(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentAndTeacher = mapper.getStudentAndTeacher();

        for (Student studentandteacher : studentAndTeacher) {
            System.out.println(studentandteacher);
        }

        sqlSession.close();
    }

}
