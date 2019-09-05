package com.immoc.repository;

import com.immoc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2019/8/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {


    @Autowired
    private  ProductCategoryRepository productCategoryRepository;


    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        List<ProductCategory>  productCategoryList = productCategoryRepository.findByCategoryTypeIn(list);
        System.out.println(productCategoryList.get(0).getCategoryName());
    }

}