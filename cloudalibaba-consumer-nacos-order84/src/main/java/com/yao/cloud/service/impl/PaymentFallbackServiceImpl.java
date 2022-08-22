package com.yao.cloud.service.impl;

import com.yao.cloud.entities.CommonResult;
import com.yao.cloud.entities.Payment;
import com.yao.cloud.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
