package br.com.roma;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.roma.domain.Categoria;
import br.com.roma.repository.CategoriaRepository;

@SpringBootApplication
public class LojaonlineApplication{

	
	
	public static void main(String[] args) {
		SpringApplication.run(LojaonlineApplication.class, args);
	}

	
}
