package com.techprimers.springbootsoapexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {

}
