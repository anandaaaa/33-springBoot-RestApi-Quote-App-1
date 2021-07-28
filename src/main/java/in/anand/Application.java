package in.anand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.anand.service.QuoteClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class, args);
		//QuoteClient bean = configurableApplicationContext.getBean(QuoteClient.class);
		//bean.invokeRandomQuoteApi();
	}

}
