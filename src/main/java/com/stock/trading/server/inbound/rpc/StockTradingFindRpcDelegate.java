package com.stock.trading.server.inbound.rpc;

import com.stock.trading.server.domain.find.StockTradingFindSymbolService;
import com.stock.trading.server.domain.model.Stock;
import com.stock.trading.server.domain.model.Symbol;
import com.stock.trading.server.inbound.common.Delegate;
import com.stock.trading.server.inbound.common.mapper.StockTradingMapper;
import com.stock.trading.server.vm.model.StockResponse;
import com.stock.trading.server.vm.api.StockTradingFind;
import org.springframework.beans.factory.annotation.Autowired;

import static com.stock.trading.server.inbound.common.Delegate.Type.RPC;

@Delegate(RPC)
public class StockTradingFindRpcDelegate implements StockTradingFind {

    private final StockTradingFindSymbolService stockTradingFindSymbolService;
    private final StockTradingMapper stockTradingMapper;

    @Autowired
    public StockTradingFindRpcDelegate(StockTradingFindSymbolService stockTradingFindSymbolService,
                                       StockTradingMapper stockTradingMapper) {
        this.stockTradingFindSymbolService = stockTradingFindSymbolService;
        this.stockTradingMapper = stockTradingMapper;
    }

    @Override
    public StockResponse find(String symbol) {
        Stock bySymbol = stockTradingFindSymbolService.findBySymbol(Symbol.valueOf(symbol));
        return stockTradingMapper.apply(bySymbol);
    }
}
