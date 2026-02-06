package br.com.alura.LuandaLl.TabelaFibeAplication;

import br.com.alura.LuandaLl.TabelaFibeAplication.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelaFibeAplicationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelaFibeAplicationApplication.class, args);
		Principal principal  = new Principal();
		principal.exibeMenu();
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
