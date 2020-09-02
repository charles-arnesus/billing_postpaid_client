package com.charles.billing_postpaid_client.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "pdam_bill")
public class Bill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "biller_id")
    private String billerId;
    @Column(name = "customer_account_id")
    private String customerAccountId;
    @Column(name = "due_date")
    private LocalDate dueDate;
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "status")
    private String status;

    public Bill() {

    }

    public Bill(String billerId, String customerAccountId, LocalDate dueDate, Double totalAmount, String status) {
        this.billerId = billerId;
        this.customerAccountId = customerAccountId;
        this.dueDate = dueDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(String customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
