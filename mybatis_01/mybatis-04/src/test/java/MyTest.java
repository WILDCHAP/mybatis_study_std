import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    @Test
    public void test01(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "a");

        List<User> users = mapper.searchUsersByName(map);

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
