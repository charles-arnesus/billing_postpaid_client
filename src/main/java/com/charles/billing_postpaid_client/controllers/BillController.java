package com.charles.billing_postpaid_client.controllers;

import com.charles.billing_postpaid_client.models.Bill;
import com.charles.billing_postpaid_client.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/postpaid_bill/")
public class BillController {

    @Autowired
    private BillRepository billRepository;

    @PostMapping("/")
    public Bill addBill(@RequestBody Bill bill) {
        return billRepository.save(bill);
    }

}
