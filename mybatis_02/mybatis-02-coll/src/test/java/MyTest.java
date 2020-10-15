import com.wildchap.dao.TeacherMapper;
import com.wildchap.pojo.Teacher;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        for (Teacher teacher : sqlSession.getMapper(TeacherMapper.class).getAllTeacher()) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacherById(1));

        sqlSession.close();
    }

}
