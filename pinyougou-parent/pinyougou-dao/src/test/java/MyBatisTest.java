import com.itheima.IUserDao.IUserDao;
import com.itheima.domain.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest  {
    public static void main(String[] args) throws IOException {
        //1读取配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        List<user> users = userDao.findAll();
        for (user user : users) {
            System.out.println("user = " + user);
        }
        session.close();
        in.close();

    }


}
