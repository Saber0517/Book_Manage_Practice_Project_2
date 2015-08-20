package bean;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.WorkService;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class TestIOC {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        JhonBean b1 = (JhonBean) context.getBean("johnBean");
        JhonBean b2 = (JhonBean) context.getBean("johnBean");
        WorkService workService = (WorkService) context.getBean("ws");
        workService.work("lalal");
        //proxy??
        System.out.println(workService.getClass().getName());
    }
}
