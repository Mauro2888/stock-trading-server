package com.stock.trading.server.inbound.mapper;

import com.stock.trading.server.domain.Symbol;
import com.stock.trading.server.inbound.model.StockResponse;
import com.stock.trading.server.outbound.jpa.Stock;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StockTradingMapper implements Function<Stock, StockResponse> {
    @Override
    public StockResponse apply(Stock stock) {
        return StockResponse.builder()
                .withName(stock.getName())
                .withSymbol(stock.getSymbol().name())
                .withPrice(stock.getPrice())
                .build();
    }
}
