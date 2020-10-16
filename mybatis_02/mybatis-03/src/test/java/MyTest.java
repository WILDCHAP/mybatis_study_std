import com.wildchap.dao.StudentMapper;
import com.wildchap.pojo.Student;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Map map = new HashMap();

        //map.put("sid", 1);
        map.put("name", "xie");

        List<Student> students = mapper.selectStudent(map);

        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Map map = new HashMap();

        map.put("sid", 1);
        map.put("tid", 2);

        mapper.updateStudent(map);

        sqlSession.close();
    }

}
