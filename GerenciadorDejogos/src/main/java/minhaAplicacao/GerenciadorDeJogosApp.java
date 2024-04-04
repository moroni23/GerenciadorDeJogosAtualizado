package minhaAplicacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GerenciadorDeJogosApp {
    public static void main(String[] args) {
        SpringApplication.run(GerenciadorDeJogosApp.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> {
            System.out.println("tudo ok");
        };
    }
}

