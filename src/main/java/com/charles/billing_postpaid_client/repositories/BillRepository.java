package com.charles.billing_postpaid_client.repositories;

import com.charles.billing_postpaid_client.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, String> {
    Bill findFirstByBillerIdAndCustomerAccountIdAndStatusOrderByDueDate(
            String billerId,
            String customerAccountId,
            String status
    );

    Bill save(Bill bill);
}
