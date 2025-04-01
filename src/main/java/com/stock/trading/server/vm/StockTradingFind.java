package com.stock.trading.server.vm;

import com.stock.trading.server.inbound.model.StockResponse;

public interface StockTradingFind {
    StockResponse find(String symbol);
}
