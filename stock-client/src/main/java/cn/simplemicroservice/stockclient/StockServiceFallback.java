package cn.simplemicroservice.stockclient;

import com.ctnrs.basic.core.base.ResResultManager;
import com.ctnrs.basic.core.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StockServiceFallback implements StockClientService{

    @Override
    public R<Stock> findStockByProductId(Long productId) {
        log.info("findStockByProductId fall back!");
        return ResResultManager.setResultSuccess();
    }

    @Override
    public R<Boolean> deductionStock(Long productId, int count) {
        log.info("deductionStock fall back!");
        return ResResultManager.setResultSuccess();
    }
}
