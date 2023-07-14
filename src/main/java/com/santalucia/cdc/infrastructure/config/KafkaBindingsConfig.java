package com.santalucia.cdc.infrastructure.config;

import org.apache.kafka.common.TopicPartition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

/**
 * Configuracion de bindings para Kafka
 *
 * @author Arquetipo
 */
@Configuration
@Getter
public class KafkaBindingsConfig {

	/**
	 * Dead letter topic
	 * 
	 * @param dlqName Nombre de la dlt. Debe seguir el patron por defecto Spring
	 *                Cloud Streams
	 * @return topic
	 */
	@Bean(name = "deadLetterTopic")
	public TopicPartition deadLetterTopic(@Value("${santalucia.ams.features.events.kafka.dlq}") String dlqName) {
		return new TopicPartition(dlqName, -1);
	}
}
