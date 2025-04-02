package com.stock.trading.server.outbound.projector;

import com.stock.trading.server.domain.Symbol;

import java.math.BigDecimal;

public class StockQueryRes {

    private final String name;
    private final BigDecimal price;
    private final Symbol symbol;

    public StockQueryRes(String name, BigDecimal price, Symbol symbol) {
        this.name = name;
        this.price = price;
        this.symbol = symbol;
    }

    public String name() {
        return name;
    }

    public BigDecimal price() {
        return price;
    }

    public Symbol symbol() {
        return symbol;
    }
}