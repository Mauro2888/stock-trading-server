package com.stock.trading.server.inbound.rpc;

import com.stock.trading.server.inbound.common.Delegate;
import com.stock.trading.server.inbound.rpc.mapper.StockTradingFindRpcMapper;
import com.stock.trading.server.vm.api.StockTradingFind;
import com.stock.trading.service.inbound.StockProtoRequest;
import com.stock.trading.service.inbound.StockProtoResponse;
import com.stock.trading.service.inbound.StockTradingFindServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;

import static com.stock.trading.server.inbound.common.Delegate.Type.RPC;

@GrpcService
public class StockTradingFindRpcImpl extends StockTradingFindServiceGrpc.StockTradingFindServiceImplBase {

    private final StockTradingFind delegate;
    private final StockTradingFindRpcMapper stockTradingFindRpcMapper;

    @Autowired
    public StockTradingFindRpcImpl(@Delegate(RPC) StockTradingFind delegate,
                                   StockTradingFindRpcMapper stockTradingFindRpcMapper) {
        this.delegate = delegate;
        this.stockTradingFindRpcMapper = stockTradingFindRpcMapper;
    }

    @Override
    public void find(StockProtoRequest request, StreamObserver<StockProtoResponse> responseObserver) {
        var stockResponse = delegate.find(request.getSymbol());
        responseObserver.onNext(stockTradingFindRpcMapper.apply(stockResponse));
        responseObserver.onCompleted();
        responseObserver
                .onError(Status.NOT_FOUND
                        .withDescription("Sorry, found no movies to recommend").asRuntimeException());
    }

    @Override
    public void subscribe(StockProtoRequest request, StreamObserver<StockProtoResponse> responseObserver) {

        for (int i = 0; i < 10; i++) {
            var stockResponse = delegate.find(request.getSymbol());
            responseObserver.onNext(stockTradingFindRpcMapper.apply(stockResponse));
        }
        responseObserver.onCompleted();
        responseObserver
                .onError(Status.NOT_FOUND
                        .withDescription("Sorry, found no movies to recommend").asRuntimeException());
}
}
