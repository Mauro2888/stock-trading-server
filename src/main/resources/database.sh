docker run -p 5432:5432 \
 -e POSTGRES_PASSWORD=postgres \
 -e POSTGRES_USER=postgres \
 -e POSTGRES_DB=stock_trading \
    postgres:17.2