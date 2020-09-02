package com.charles.billing_postpaid_client.controllers;

import com.charles.billing_postpaid_client.models.Bill;
import com.charles.billing_postpaid_client.models.PaymentRequest;
import com.charles.billing_postpaid_client.models.PaymentResponse;
import com.charles.billing_postpaid_client.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/api/pay")
public class PostpaidClientPaymentController {

    public static final String SUCCESS = "success";
    public static final String PAID = "paid";

    @Autowired
    private BillRepository billRepository;

    @PostMapping("/")
    public PaymentResponse doPayment(@RequestBody PaymentRequest paymentRequest) throws Throwable {
        try {
            Bill bill = new Bill();
            bill.setBillerId(paymentRequest.getBillerId());
            bill.setCustomerAccountId(paymentRequest.getCustomerAccountId());
            bill.setPaymentDate(LocalDate.now());
            bill.setPaymentId(UUID.randomUUID());
            bill.setDueDate(paymentRequest.getDueDate());
            bill.setTotalAmount(paymentRequest.getTotalAmount());
            bill.setStatus(PAID);
            Bill billResponse = billRepository.save(bill);

            PaymentResponse response = new PaymentResponse();
            response.setPaymentId(billResponse.getPaymentId());
            response.setBillerId(billResponse.getBillerId());
            response.setCustomerAccountId(billResponse.getCustomerAccountId());
            response.setStatus(SUCCESS);
            response.setTotalAmount(billResponse.getTotalAmount());
            response.setPaymentDate(billResponse.getPaymentDate());

            return response;

        } catch (Exception e) {
            throw e.getCause();
        }
    }

}
