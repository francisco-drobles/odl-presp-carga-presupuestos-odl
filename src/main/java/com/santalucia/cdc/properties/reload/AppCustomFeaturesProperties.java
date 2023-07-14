package com.santalucia.cdc.properties.reload;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * Propiedades de configuracion del proceso de negocio de la aplicacion
 *
 * @author accenture_arq
 *
 */
@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app.custom.features")
public class AppCustomFeaturesProperties {

	/**
	 * Definicion de chunkSize
	 */
	private int retryMaxAttempt=3;
	private long retryInterval=3000L;
	private int attempt= 1;

}
