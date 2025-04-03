package com.stock.trading.server.outbound.projector;

import com.stock.trading.server.domain.model.Symbol;

import java.math.BigDecimal;

public record StockQueryRes(String name, BigDecimal price, Symbol symbol) {

}