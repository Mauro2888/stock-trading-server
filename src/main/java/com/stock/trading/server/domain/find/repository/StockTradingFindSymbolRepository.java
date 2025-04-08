package com.stock.trading.server.domain.find.repository;

import com.stock.trading.server.domain.model.Stock;
import com.stock.trading.server.domain.model.Symbol;

public interface StockTradingFindSymbolRepository {
    Stock find(Symbol symbol);
}
