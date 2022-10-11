package org.wang.springcloud.controller;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wang.springcloud.services.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @author Wang
 * @date 2022/10/9 15:59
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

}
