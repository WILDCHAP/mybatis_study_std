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
    public void test(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("value", "a");

        List<User> userList = mapper.searchUserByName(map);

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
