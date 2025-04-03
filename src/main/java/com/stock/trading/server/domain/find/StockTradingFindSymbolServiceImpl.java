package com.stock.trading.server.domain.find;

import com.stock.trading.server.domain.model.Symbol;
import com.stock.trading.server.domain.model.Stock;
import com.stock.trading.server.outbound.repository.StockTradingFindBySymbolRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class StockTradingFindSymbolServiceImpl implements StockTradingFindSymbolService {

    private final StockTradingFindBySymbolRepositoryJpa stockTradingFindBySymbolRepository;
    private final Logger log = Logger.getLogger(getClass().getName());

    @Autowired
    public StockTradingFindSymbolServiceImpl(StockTradingFindBySymbolRepositoryJpa stockTradingFindBySymbolRepository) {
        this.stockTradingFindBySymbolRepository = stockTradingFindBySymbolRepository;
    }

    @Override
    public Stock findBySymbol(Symbol symbol) {
        var result = stockTradingFindBySymbolRepository.findBySymbol(symbol);
        return new com.stock.trading.server.domain.model.Stock(result.name(),
                result.price(),
                result.symbol());
    }
}
