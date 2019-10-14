import org.springframework.context.*;
import org.springframework.context.support.*;

public class Driver {

	/**
	 * 
	 * Extracts MessageRenderer bean from Spring and renders message
	 */
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Fetch MessageRenderer implementation
		
		MessageRenderer renderer = context.getBean("messageRenderer", MessageRenderer.class);
		
		System.out.println("Welcome to the World of Spring. Here is your message");
		
		// Display message
		
		//TODO call renderMessage on the renderer
		


		
	}

}
