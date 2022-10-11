package com.wang.springcloud.service;

import com.wang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Wang
 * @date 2022/9/21 11:07
 */

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentGetById(@Param("id")  Long id);
}
