package org.techfrog.restprotocolbuffers;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@TestConfiguration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate restTemplate(ProtobufHttpMessageConverter protobufHttpMessageConverter) {
        return new RestTemplateBuilder()
                .additionalMessageConverters(protobufHttpMessageConverter)
                .build();
    }
}
