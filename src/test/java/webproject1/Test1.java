package webproject1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dgr.controller.UserController;
import com.dgr.model.Users;

public class Test1 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController userController = context.getBean(UserController.class);	
	/*	List<Users> list = userController.queryall();
		for (Users users : list) {
			System.out.println(users.toString());
		}*/
	}
}
