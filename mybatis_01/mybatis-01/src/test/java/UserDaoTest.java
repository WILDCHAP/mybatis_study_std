import com.wildchap.dao.User;
import com.wildchap.dao.UserMapper;
import com.wildchap.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){

        //获取数据库链接(sqlSession对象)
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //执行Mapper/Dao的SQL语句
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //查询id为1的用户
        User user = userMapper.getUserById(2);
        System.out.println(user);

        //关闭sqlSession
        sqlSession.close();

    }
}
