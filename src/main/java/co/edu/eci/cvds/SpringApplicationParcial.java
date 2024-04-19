package co.edu.eci.cvds;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.service.saray_mendivelsoConfigurationService;
import co.edu.eci.cvds.service.ConfigurationService;
import co.edu.eci.cvds.controller.saray_mendivelsoController;
import co.edu.eci.cvds.model.saray_mendivelsoModel;
import co.edu.eci.cvds.repository.saray_mendivelsoRepository;

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
	private final saray_mendivelsoConfigurationService saray_mendivelsoConfigurationService;
	private ConfigurationService ConfigurationService;
	@Autowired
	public SpringApplicationParcial(
			ConfigurationService configurationService,
			saray_mendivelsoConfigurationService saray_mendivelsoConfigurationService, ConfigurationService configurationService2

	) {
		this.configurationService = configurationService2;
		this.saray_mendivelsoConfigurationService = saray_mendivelsoConfigurationService;

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
