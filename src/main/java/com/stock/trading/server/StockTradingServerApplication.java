package com.stock.trading.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StockTradingServerApplication  {

    public static void main(String[] args) {
        SpringApplication.run(StockTradingServerApplication.class, args);
    }
}
