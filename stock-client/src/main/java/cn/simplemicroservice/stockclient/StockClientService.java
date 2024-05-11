package cn.simplemicroservice.stockclient;

import com.ctnrs.basic.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "stock-service", fallback = StockServiceFallback.class)
public interface StockClientService {
    /**
     * 根据商品id查询商品库存
     *
     * @return
     */
    @GetMapping("/stock/findStockByProductId/{productId}")
    public R<Stock> findStockByProductId(@RequestParam("productId") Long productId);

    @PostMapping("/stock/deductionStock")
    public R<Boolean> deductionStock(@RequestParam(value = "productId") Long productId,
                                     @RequestParam(value = "count") int count);
}
