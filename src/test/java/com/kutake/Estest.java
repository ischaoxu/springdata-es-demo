package com.kutake;

import com.kutake.dao.ElasticDao;
import com.kutake.dao.Product;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class Estest {
    @Autowired
    private ElasticDao elasticDao;

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    public void test1() throws IOException {


        Product product = new Product();
        product.setProductName("nnn");
        product.setId(30L);
        product.setPrice(120.00);
        product.setStore(123);
        Product save =(Product) elasticDao.save(product);
        System.out.println(save.getId());

    }
}
