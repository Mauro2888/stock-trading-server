package com.stock.trading.server.domain.find;

import com.stock.trading.server.domain.find.repository.StockTradingFindSymbolRepository;
import com.stock.trading.server.domain.model.Stock;
import com.stock.trading.server.domain.model.Symbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockTradingFindSymbolServiceImpl implements StockTradingFindSymbolService {

    private final StockTradingFindSymbolRepository stockTradingFindBySymbolRepository;

    @Autowired
    public StockTradingFindSymbolServiceImpl(StockTradingFindSymbolRepository stockTradingFindBySymbolRepository) {
        this.stockTradingFindBySymbolRepository = stockTradingFindBySymbolRepository;
    }

    @Override
    public Stock findBySymbol(Symbol symbol) {
        return stockTradingFindBySymbolRepository.find(symbol);
    }
}
