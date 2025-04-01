package com.stock.trading.server.domain.find;

import com.stock.trading.server.domain.Symbol;
import com.stock.trading.server.outbound.jpa.Stock;
import com.stock.trading.server.outbound.repository.StockTradingFindBySymbolRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockTradingFindSymbolServiceImpl implements StockTradingFindSymbolService {

    private final StockTradingFindBySymbolRepositoryJpa stockTradingFindBySymbolRepository;

    @Autowired
    public StockTradingFindSymbolServiceImpl(StockTradingFindBySymbolRepositoryJpa stockTradingFindBySymbolRepository) {
        this.stockTradingFindBySymbolRepository = stockTradingFindBySymbolRepository;
    }

    @Override
    public Stock findBySymbol(Symbol symbol) {
        return stockTradingFindBySymbolRepository.findBySymbol(symbol);
    }
}
