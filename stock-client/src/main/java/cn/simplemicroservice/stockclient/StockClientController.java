package cn.simplemicroservice.stockclient;

import com.ctnrs.basic.core.util.R;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping("stock")
public class StockClientController {
    @Qualifier("cn.simplemicroservice.stockclient.StockClientService")
    @Autowired
    private final StockClientService stockClientService;

    /**
     * 根据商品id查询商品库存
     *
     * @return
     */
    @GetMapping("/findStockByProductId/{productId}")
    public Stock findStockByProductId(@PathVariable("productId") Long productId){
        Stock stock = stockClientService.findStockByProductId(productId).getResult();
        log.info("-------------In client findStockByProductId---------------");
        return stock;
    }

    @PostMapping("/deductionStock")
    public boolean deductionStock(@RequestParam(value = "productId") Long productId,
                                     @RequestParam(value = "count") int count){
        boolean res = stockClientService.deductionStock(productId, count).getResult();
        log.info("-------------In client deductionStock---------------");
        return res;
    }
}
