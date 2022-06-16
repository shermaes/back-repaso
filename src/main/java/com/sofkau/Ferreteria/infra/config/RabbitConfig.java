package com.sofkau.Ferreteria.infra.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public final static String EXCHANGE = "ferreteria.exchange";
    public final static String CREAR_PRODUCTO_QUEUE = "action.crear.producto";
    public final static String CREAR_PRODUCTO_ROUTINKEY = "publish.crear.producto";

    @Bean
    public TopicExchange getTopicExhange(){
        return new TopicExchange(EXCHANGE);
    }
    @Bean
    public Queue getQueue(){
        return new Queue(CREAR_PRODUCTO_QUEUE);
    }

    @Bean
    public Binding bindToCreateProduct(){
        return BindingBuilder.bind(getQueue()).to(getTopicExhange()).with(CREAR_PRODUCTO_ROUTINKEY);
    }



}
