package br.com.springboot.cursojdevtreinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class CursoJdevTreinamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoJdevTreinamentoApplication.class, args);
	}

}
