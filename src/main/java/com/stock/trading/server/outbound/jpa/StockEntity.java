package com.stock.trading.server.outbound.jpa;

import com.stock.trading.server.outbound.jpa.common.BaseEntity;
import com.stock.trading.server.domain.Symbol;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "stock")
public class StockEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "price", nullable = false)
    private BigDecimal price;
    @Enumerated (EnumType.STRING)
    @Column(name = "symbol", nullable = false)
    private Symbol symbol;

    public StockEntity() {
    }

    public StockEntity(UUID id, Instant insertDateTime, Instant updateDateTime, Long version, String name, BigDecimal price, Symbol symbol) {
        super(id, insertDateTime, updateDateTime, version);
        this.name = name;
        this.price = price;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
