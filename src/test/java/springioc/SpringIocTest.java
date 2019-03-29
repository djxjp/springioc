package springioc;

import com.itcast.meat.User;
import com.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class SpringIocTest {
    @Autowired
    private UserService userService;
    @Test
    public void addTest(){
        userService.addUser(new User("小花"));
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.addUser(new User("宝宝"));
    }
}
