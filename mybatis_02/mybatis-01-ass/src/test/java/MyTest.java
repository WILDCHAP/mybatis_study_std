import com.wildchap.dao.StudentMapper;
import com.wildchap.pojo.Student;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        for (Student student : sqlSession.getMapper(StudentMapper.class).selectAllStudent()) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        System.out.println(sqlSession.getMapper(StudentMapper.class).selectStudentById(1));


        sqlSession.close();
    }

}
