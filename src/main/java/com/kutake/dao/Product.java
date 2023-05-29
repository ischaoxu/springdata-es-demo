package com.kutake.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@Document(indexName = "product",shards = 1, replicas = 1)
public class Product implements Serializable {
    @Id
    private Long id;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String productName;
    @Field(type = FieldType.Integer)
    private Integer store;
    @Field(type = FieldType.Double, index = true, store = false)
    private double price;
}