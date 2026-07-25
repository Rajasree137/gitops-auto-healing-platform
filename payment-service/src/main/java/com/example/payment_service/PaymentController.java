package com.example.payment_service;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicBoolean;

@RestController
@RequestMapping("/api")
public class PaymentController {

    private final AtomicBoolean failureMode = new AtomicBoolean(false);

    @GetMapping("/payment")
    public String processPayment() {
        if (failureMode.get()) {
            throw new RuntimeException("Payment processing failed - Internal Server Error");
        }
        return "Payment processed successfully";
    }

    @PostMapping("/toggle-failure")
    public String toggleFailure(@RequestParam boolean enable) {
        failureMode.set(enable);
        return "Failure mode set to: " + enable;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
