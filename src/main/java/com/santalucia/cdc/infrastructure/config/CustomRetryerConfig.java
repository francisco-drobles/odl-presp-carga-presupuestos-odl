package com.santalucia.cdc.infrastructure.config;

import org.springframework.stereotype.Component;

import com.santalucia.cdc.properties.reload.AppCustomFeaturesProperties;

import feign.RetryableException;
import feign.Retryer;

import lombok.extern.slf4j.Slf4j;

/**
 * Configuracion del retryer customizada
 * 
 */
@Slf4j
@Component
public class CustomRetryerConfig implements Retryer {

	private final AppCustomFeaturesProperties properties;

	/**
	 * Constructor de la clase config
	 * 
	 * @param props
	 */
	public CustomRetryerConfig(AppCustomFeaturesProperties props) {
		this.properties = props;
	}

	/**
	 * continueOrPropagate overrided method
	 * 
	 * @param e RetryableException
	 */
	@Override
	public void continueOrPropagate(RetryableException e) {
		int attempt = this.properties.getAttempt();
		long retryInterval = this.properties.getRetryInterval();
		int retryMaxAttempt = this.properties.getRetryMaxAttempt();
		log.info("Feign retry attempt {} due to {} ", attempt, e.getMessage());
		if (attempt++ == retryMaxAttempt) {
			throw e;
		}
		this.properties.setAttempt(attempt);
		try {
			Thread.sleep(retryInterval);
		} catch (InterruptedException ignored) {
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * clone overrided method
	 */
	@Override
	public Retryer clone() {
		return new CustomRetryerConfig(properties);
	}
}
