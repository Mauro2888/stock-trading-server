package com.stock.trading.server.domain.model;

import java.math.BigDecimal;

public record Stock(String name, BigDecimal price, Symbol symbol) {
}
