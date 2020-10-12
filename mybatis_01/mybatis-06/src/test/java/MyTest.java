import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import com.wildchap.utils.Mybaties;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void addTest(){
        SqlSession sqlSession = Mybaties.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.insertIntoUser(new User(1,"abc","123"));

        sqlSession.close();
    }

    @Test
    public void deleteTest(){
        SqlSession sqlSession = Mybaties.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteFromUser(1);

        sqlSession.close();
    }

}
