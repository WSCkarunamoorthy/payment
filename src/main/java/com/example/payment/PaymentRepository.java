package com.example.payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<payment, String> {
    // Custom query methods (if needed) can be added here
}
