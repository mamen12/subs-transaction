package com.api.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.transaction.model.TransactionPayment;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionPayment, Long> {

}
