package com.entidades.buenSabor.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("El Buen Sabor - Grupo 2")
                        .version("v 1.12")
                        .description("<b>\"El Buen Sabor\"</b> E-commerce </br> API" +
                                "<h3>Integrantes</h3>" +
                                "<ul> <li> Cataldo, Nicolás </li> <li> Padilla, Bruno </li> <li> Pérez Moro, Guido </li> </ul>")
                );
    }
}