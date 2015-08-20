import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class DataSourceTest {
    @Test
    public void test() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DataSource ds = (DataSource) context.getBean("dataSource");
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }

}
