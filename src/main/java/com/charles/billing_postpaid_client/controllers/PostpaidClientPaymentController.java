package com.charles.billing_postpaid_client.controllers;

import com.charles.billing_postpaid_client.models.PaymentRequest;
import com.charles.billing_postpaid_client.models.PaymentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/pay")
public class PostpaidClientPaymentController {

    public static final String SUCCESS = "success";

    @PostMapping("/")
    public PaymentResponse doPayment(@RequestBody PaymentRequest paymentRequest) {
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(UUID.randomUUID());
        response.setBillerId(paymentRequest.getBillerId());
        response.setCustomerAccountId(paymentRequest.getCustomerAccountId());
        response.setStatus(SUCCESS);
        response.setTotalAmount(70000.00);
        return response;
    }

}
