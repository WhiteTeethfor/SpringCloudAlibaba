package org.wang.springcloud.controller;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.wang.springcloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wang
 * @date 2022/9/21 11:10
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result= paymentService.create(payment);
        log.info("*****插入结果*****"+result);
        if(result>0){

            return new CommonResult(200,"插入成功,返回结果"+result+"服务端口："+serverPort,payment);
        }else{
            return  new CommonResult(444,"插入数据库失败",null);
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentGetById = paymentService.getPaymentGetById(id);
        log.info("*****插入结果"+paymentGetById);
        if(paymentGetById!=null){

            return new CommonResult(200,"查询成功"+"\t 服务端口："+serverPort,paymentGetById);
        }else{
            return  new CommonResult(444,"获取失败",null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery()
    {

        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            System.out.println(element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance element : instances) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }
}
