package com.stock.trading.server.vm.rpc;

import com.stock.trading.server.vm.model.StockResponse;

public interface StockTradingRpcFind {
    StockResponse find(String symbol);
}
