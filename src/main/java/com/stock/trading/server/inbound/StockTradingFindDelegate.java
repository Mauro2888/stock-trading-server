package com.stock.trading.server.inbound;

import com.stock.trading.server.domain.model.Symbol;
import com.stock.trading.server.domain.find.StockTradingFindSymbolService;
import com.stock.trading.server.inbound.common.Delegate;
import com.stock.trading.server.inbound.mapper.StockTradingMapper;
import com.stock.trading.server.inbound.model.StockResponse;
import com.stock.trading.server.vm.StockTradingFind;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;


@Delegate
public class StockTradingFindDelegate implements StockTradingFind {

    private final Logger log = Logger.getLogger(getClass().getName());
    private final StockTradingFindSymbolService stockTradingFindSymbolService;
    private final StockTradingMapper stockTradingMapper;

    @Autowired
    public StockTradingFindDelegate(StockTradingFindSymbolService stockTradingFindSymbolService,
                                    StockTradingMapper stockTradingMapper) {
        this.stockTradingFindSymbolService = stockTradingFindSymbolService;
        this.stockTradingMapper = stockTradingMapper;
    }

    @Override
    public StockResponse find(String symbol) {
        log.info(() -> "Finding stock with symbol: %s".formatted(symbol));
        var res = stockTradingFindSymbolService.findBySymbol(Symbol.valueOf(symbol));
        return stockTradingMapper.apply(res);
    }
}
