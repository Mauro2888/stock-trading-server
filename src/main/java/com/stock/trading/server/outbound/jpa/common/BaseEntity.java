package com.stock.trading.server.outbound.jpa.common;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.Instant;
import java.util.UUID;

import static java.sql.Types.TIMESTAMP_WITH_TIMEZONE;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @CreationTimestamp
    @JdbcTypeCode(TIMESTAMP_WITH_TIMEZONE)
    @Column(name = "insert_datetime", updatable = false, nullable = false)
    private Instant insertDateTime;

    @UpdateTimestamp
    @JdbcTypeCode(TIMESTAMP_WITH_TIMEZONE)
    @Column(name = "update_datetime")
    private Instant updateDateTime;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    protected BaseEntity() {}

    protected BaseEntity(UUID id, Instant insertDateTime, Instant updateDateTime, Long version) {
        this.id = id;
        this.insertDateTime = insertDateTime;
        this.updateDateTime = updateDateTime;
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    public Instant getInsertDateTime() {
        return insertDateTime;
    }

    public Instant getUpdateDateTime() {
        return updateDateTime;
    }
}
