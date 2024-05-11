package com.example.productclient;

import com.ctnrs.basic.core.base.ResResultManager;
import com.ctnrs.basic.core.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ProductServiceFallback implements ProductServiceClient{

    @Override
    public R<Product> findByProductId(Long productId) {
        log.info("findByProductId call back!");
        return ResResultManager.setResultSuccess();
    }

    @Override
    public List<Product> queryAllProduct() {
        log.info("queryAllProduct call back!");
        return null;
    }

    @Override
    public List<Product> queryAl() {
        return null;
    }
}
