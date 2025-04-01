package com.stock.trading.server.domain.find;

import com.stock.trading.server.domain.Symbol;
import com.stock.trading.server.outbound.jpa.Stock;

public interface StockTradingFindSymbolService {
    Stock findBySymbol(Symbol symbol);
}
