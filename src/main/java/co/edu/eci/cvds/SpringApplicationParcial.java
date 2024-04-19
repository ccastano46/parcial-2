package co.edu.eci.cvds;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.service.ConfigurationService;
import co.edu.eci.cvds.service.JosueHernandezService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class SpringApplicationParcial {
	private final ConfigurationService configurationService;
	private final JosueHernandezService josueHernandezService;
	@Autowired
	public SpringApplicationParcial(
			ConfigurationService configurationService,
			JosueHernandezService josueHernandezService
			) {
		this.configurationService = configurationService;
		this.josueHernandezService = josueHernandezService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationParcial.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return (args) -> {
			System.out.println("Exitos en este parcial");
		};
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
