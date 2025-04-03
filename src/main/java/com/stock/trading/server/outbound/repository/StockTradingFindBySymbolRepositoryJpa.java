package com.stock.trading.server.outbound.repository;

import com.stock.trading.server.domain.model.Symbol;
import com.stock.trading.server.outbound.jpa.StockEntity;
import com.stock.trading.server.outbound.projector.StockQueryRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockTradingFindBySymbolRepositoryJpa extends JpaRepository<StockEntity, UUID> {

    @Query("""
            SELECT new com.stock.trading.server.outbound.projector.StockQueryRes(s.name, s.price, s.symbol)
            FROM StockEntity s WHERE s.symbol = :symbol
            """)
    StockQueryRes findBySymbol(@Param("symbol") Symbol symbol);
}
