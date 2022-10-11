package org.wang.springcloud.service.Impl;

import com.wang.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import org.wang.springcloud.dao.PaymentDao;
import org.wang.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author Wang
 * @date 2022/9/21 11:08
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentGetById(Long id) {
        return paymentDao.getPaymentGetById(id);
    }
}
