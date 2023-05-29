package com.kutake.config;

import lombok.Data;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@SpringBootConfiguration
@ConfigurationProperties(prefix = "myesinfo")
@Data
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    private String host;
    private int port;


    @Override
    public RestHighLevelClient elasticsearchClient() {
        System.out.println(host);
        System.out.println(port);
        RestClientBuilder builder = RestClient.builder(new HttpHost(host,port,"http"));
        return new RestHighLevelClient(builder);
    }
}
