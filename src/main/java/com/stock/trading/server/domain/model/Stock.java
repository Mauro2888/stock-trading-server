package com.stock.trading.server.domain.model;

import com.stock.trading.server.domain.Symbol;

import java.math.BigDecimal;

public record Stock(String name, BigDecimal price, Symbol symbol) {
}
