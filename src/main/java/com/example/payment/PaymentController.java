package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Create a new payment
    @PostMapping
    public payment createPayment(@RequestBody payment newPayment) {
        return paymentService.createPayment(newPayment);
    }

    // Get all payments
    @GetMapping
    public List<payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Get a specific payment by ID
    @GetMapping("/{id}")
    public ResponseEntity<payment> getPaymentById(@PathVariable String id) {
        Optional<payment> payment = paymentService.getPaymentById(id);
        return payment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update an existing payment
    @PutMapping("/{id}")
    public ResponseEntity<payment> updatePayment(@PathVariable String id, @RequestBody payment updatedPayment) {
        try {
            payment paymentResponse = paymentService.updatePayment(id, updatedPayment);
            return ResponseEntity.ok(paymentResponse);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a payment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable String id) {
        paymentService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }
}
