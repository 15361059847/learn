package com.immoc.repository;

import com.immoc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2019/8/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private  ProductInfoRepository productInfoRepository;

    @Test
    public void findProductInfoByProductStatus() throws Exception {
        List<ProductInfo> list = productInfoRepository.findProductInfoByProductStatus(0);
        System.out.println(list.size());
    }

    @Test
    public void findProductIdIn() throws Exception {
        List<String> productIdList = new ArrayList<>();
        productIdList.add("2019081301");
        productIdList.add("2019081401");
        productIdList.add("2019081402");
        List<ProductInfo> list = productInfoRepository.findByProductIdIn(productIdList);
        System.out.println(list.size());
    }


}