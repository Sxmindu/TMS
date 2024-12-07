package com.tms.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** This class the contains the cors configuration for the application. */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

  /**
   * Overided method -> {@link WebMvcConfigurer#addCorsMappings(CorsRegistry)}.
   *
   * @param registry assists with the registration of global URL mappings.
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/**")
        .allowedOrigins("http://localhost:3000")
        .allowedMethods("*")
        .allowedHeaders("*")
        .allowCredentials(true);
  }
}
