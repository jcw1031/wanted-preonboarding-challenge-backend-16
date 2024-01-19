package com.wanted.preonboarding.ticket.application;

import com.wanted.preonboarding.ticket.domain.dto.ReserveInfo;
import com.wanted.preonboarding.ticket.domain.entity.Performance;
import org.springframework.stereotype.Service;

@Service
public class PaymentManager {

    public boolean pay(Performance info, ReserveInfo reserveInfo) {
        int price = info.getPrice();
        long amount = reserveInfo.getAmount();
        if (amount < price) {
            throw new RuntimeException("잔액 부족");
        }

        reserveInfo.setAmount(amount - price);
        return true;
    }
}
