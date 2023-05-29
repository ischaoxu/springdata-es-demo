package com.kutake.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticDao extends ElasticsearchRepository<Product,Long> {
}
