package com.wang.springcloud.dao;

import com.wang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wang
 * @date 2022/9/21 10:55
 */
@Mapper
public interface PaymentDao {
      int create(Payment payment);

    Payment getPaymentGetById(@Param("id") Long id);
}
