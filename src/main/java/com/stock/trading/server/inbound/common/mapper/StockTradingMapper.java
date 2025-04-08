package com.stock.trading.server.inbound.common.mapper;

import com.stock.trading.server.domain.model.Stock;
import com.stock.trading.server.vm.model.StockResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StockTradingMapper implements Function<Stock, StockResponse> {
    @Override
    public StockResponse apply(Stock stock) {
        return StockResponse.builder()
                .withName(stock.name())
                .withSymbol(stock.symbol().name())
                .withPrice(stock.price())
                .build();
    }
}
