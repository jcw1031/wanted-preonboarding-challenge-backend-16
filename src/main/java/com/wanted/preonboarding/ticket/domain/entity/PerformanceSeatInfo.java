package com.wanted.preonboarding.ticket.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "performance_seat_info")
@Getter
public class PerformanceSeatInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, name = "performance_id")
    private UUID performanceId;
    @Column(nullable = false)
    private int round;
    @Column(nullable = false)
    private int gate;
    @Column(nullable = false)
    private String line;
    @Column(nullable = false)
    private int seat;
    @Column(nullable = false, name = "is_reserve")
    private String isReserve;

    public PerformanceSeatInfo() {
    }

    @Builder
    public PerformanceSeatInfo(UUID performanceId, int round, int gate, String line, int seat, String isReserve) {
        this.performanceId = performanceId;
        this.round = round;
        this.gate = gate;
        this.line = line;
        this.seat = seat;
        this.isReserve = isReserve;
    }
}
