package com.stock.trading.server.domain.find;

import com.stock.trading.server.domain.Symbol;
import com.stock.trading.server.domain.model.Stock;
import com.stock.trading.server.outbound.jpa.StockEntity;

public interface StockTradingFindSymbolService {
    Stock findBySymbol(Symbol symbol);
}
