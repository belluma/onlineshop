package demo.onlineshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CustomerController {
    @PostMapping("login")
    public ResponseEntity<> login(@RequestBody User userData){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("logout")
    public ResponseEntity<> logout(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PostMapping("new_customer")
    public ResponseEntity<>createAccount(@RequestBody User userData){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @PutMapping("update_customer_info")
    public ResponseEntity<>updateAccountInfo(@RequestBody User userData) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("customer_orders")
    public ResponseEntity<>getCustomersOrders(@RequestBody User userData) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}
