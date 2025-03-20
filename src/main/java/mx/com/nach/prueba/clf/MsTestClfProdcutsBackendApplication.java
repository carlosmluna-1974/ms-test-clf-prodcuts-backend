package mx.com.nach.prueba.clf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = "mx.com.nach.prueba.clf")
@ComponentScan({ "mx.com.nach.prueba.clf", "mx.com.nach.prueba.clf.*" })
@SpringBootApplication
public class MsTestClfProdcutsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTestClfProdcutsBackendApplication.class, args);
	}

}
