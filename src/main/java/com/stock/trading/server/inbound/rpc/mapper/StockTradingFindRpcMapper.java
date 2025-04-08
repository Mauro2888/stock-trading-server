package com.stock.trading.server.inbound.rpc.mapper;

import com.stock.trading.server.vm.model.StockResponse;
import com.stock.trading.service.inbound.StockProtoResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StockTradingFindRpcMapper implements Function<StockResponse, StockProtoResponse> {

    @Override
    public StockProtoResponse apply(StockResponse stock) {
        return StockProtoResponse.newBuilder()
                .setName(stock.name())
                .setSymbol(stock.symbol())
                .setPrice(stock.price().doubleValue())
                .build();
    }
}
