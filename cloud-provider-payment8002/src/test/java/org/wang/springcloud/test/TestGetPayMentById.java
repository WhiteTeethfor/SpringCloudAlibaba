package org.wang.springcloud.test;

import com.wang.springcloud.entities.Payment;
import org.wang.springcloud.dao.PaymentDao;

import javax.annotation.Resource;

/**
 * @author Wang
 * @date 2022/9/22 10:23
 */
public class TestGetPayMentById {
    @Resource
    private PaymentDao paymentDao;

    public static void main(String[] args) {
        TestGetPayMentById tg=new TestGetPayMentById();
        tg.getPm();
    }

    public  void getPm(){
        Payment paymentGetById = paymentDao.getPaymentGetById(1L);
        System.out.println(paymentGetById);
    }
}
