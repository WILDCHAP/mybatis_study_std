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
    public void test1(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> allStudent = mapper.getAllStudent();

        for (Student student : allStudent) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> allTeacher = mapper.getAllTeacher();

        for (Teacher teacher : allTeacher) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }
}
