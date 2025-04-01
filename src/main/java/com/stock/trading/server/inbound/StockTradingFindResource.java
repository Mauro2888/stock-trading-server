package com.stock.trading.server.inbound;

import com.stock.trading.server.inbound.common.Delegate;
import com.stock.trading.server.inbound.model.StockResponse;
import com.stock.trading.server.vm.StockTradingFind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;


@RestController
@RequestMapping("/api/v1/stock")
@RequestScope
public class StockTradingFindResource implements StockTradingFind {

    private final StockTradingFind delegate;

    @Autowired
    public StockTradingFindResource(@Delegate StockTradingFind delegate) {
        this.delegate = delegate;
    }

    @GetMapping
    @Override
    public StockResponse find(@RequestParam String symbol) {
        return delegate.find(symbol);
    }
}
