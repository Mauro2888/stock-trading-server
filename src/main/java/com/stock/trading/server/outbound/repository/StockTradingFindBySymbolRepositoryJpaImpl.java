package com.stock.trading.server.outbound.repository;

import com.stock.trading.server.domain.find.repository.StockTradingFindSymbolRepository;
import com.stock.trading.server.domain.model.Stock;
import com.stock.trading.server.domain.model.Symbol;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class StockTradingFindBySymbolRepositoryJpaImpl implements StockTradingFindSymbolRepository {
    private final StockTradingFindBySymbolRepositoryJpa stockTradingFindBySymbolRepositoryJpa;

    public StockTradingFindBySymbolRepositoryJpaImpl(@Lazy StockTradingFindBySymbolRepositoryJpa stockTradingFindBySymbolRepositoryJpa) {
        this.stockTradingFindBySymbolRepositoryJpa = stockTradingFindBySymbolRepositoryJpa;
    }

    @Override
    public Stock find(Symbol symbol) {
        var queryResult = stockTradingFindBySymbolRepositoryJpa.findBySymbol(symbol)
                .orElseThrow();
        return new Stock(queryResult.name(),
                queryResult.price(),
                queryResult.symbol());
    }
}
