package com.stock.trading.server.vm.api;

import com.stock.trading.server.vm.model.StockResponse;

public interface StockTradingFind {
    StockResponse find(String symbol);
}
