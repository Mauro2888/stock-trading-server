package com.stock.trading.server.outbound.repository;

import com.stock.trading.server.domain.Symbol;
import com.stock.trading.server.outbound.jpa.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockTradingFindBySymbolRepositoryJpa extends JpaRepository<Stock, UUID> {
    Stock findBySymbol(Symbol symbol);
}
