import com.wildchap.dao.UserDao;
import com.wildchap.utils.Mybatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyTest {



    @Test
    public void test() {

        Scanner input = new Scanner(System.in);
        SqlSession sqlSession = Mybatis.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        boolean tag = true;

        while (tag) {
            System.out.println("请选择：\n1. 插入\n2. 删除\n3. 修改\n其他. 退出");
            int choice = input.nextInt();
            Map<String, Object> map;
            System.out.println("11111");
            switch (choice) {
                case 1:
                    map = getInfo();
                    System.out.println(mapper.insertIntoUser(map));
                    break;
                case 2:
                    map = getInfo();
                    System.out.println(mapper.deleteFromUser(map));
                    break;
                case 3:
                    map = getInfo();
                    System.out.println(mapper.updateUser(map));
                    break;
                default:
                    tag = false;
                    break;
            }
       }

        sqlSession.close();
    }

    public Map<String, Object> getInfo() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("请输入id, name, pwd: ");
        int id = scanner.nextInt();
        String name = scanner.next();
        String pwd = scanner.next();

        map.put("id", id);
        map.put("name", name);
        map.put("pwd", pwd);

        return map;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyTest mt = new MyTest();
        SqlSession sqlSession = Mybatis.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        boolean tag = true;

        while (tag) {
            System.out.println("请选择：\n1. 插入\n2. 删除\n3. 修改\n其他. 退出");
            int choice = input.nextInt();
            Map<String, Object> map;
            switch (choice) {
                case 1:
                    map = mt.getInfo();
                    try {
                        mapper.insertIntoUser(map);
                        sqlSession.commit();
                    }catch (Exception e){
                        System.out.println("该id已存在！");
                    }
                    break;
                case 2:
                    map = mt.getInfo();
                    try {
                        mapper.deleteFromUser(map);
                        sqlSession.commit();
                    }catch (Exception e){
                        System.out.println("该id不存在！");
                    }
                    break;
                case 3:
                    map = mt.getInfo();
                    try {
                        mapper.updateUser(map);
                        sqlSession.commit();
                    }catch (Exception e){
                        System.out.println("该id不存在！");
                    }
                    break;
                default:
                    tag = false;
                    break;
            }
        }

        sqlSession.close();
    }

}
