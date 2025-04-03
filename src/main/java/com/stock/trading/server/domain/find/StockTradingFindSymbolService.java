package com.stock.trading.server.domain.find;

import com.stock.trading.server.domain.model.Symbol;
import com.stock.trading.server.domain.model.Stock;

public interface StockTradingFindSymbolService {
    Stock findBySymbol(Symbol symbol);
}
