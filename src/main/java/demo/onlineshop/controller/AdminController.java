package demo.onlineshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping("products")
    public ResponseEntity<> listAllProducts(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("products/in_stock")
    public ResponseEntity<> listAllProductsInStock(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("products/out_of_stock")
    public ResponseEntity<> listAllProductsOutOfStock(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("products/order_pending")
    public ResponseEntity<> listAllProductsReordered(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @PostMapping("products")
    public ResponseEntity<>createNewProduct(@RequestBody){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @PutMapping("products")
    public ResponseEntity<>updateProduct(@RequestBody){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @DeleteMapping("products")
    public ResponseEntity<>deleteProduct(@RequestBody){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("orders")
    public ResponseEntity<> listAllOrders(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("orders/pending")
    public ResponseEntity<> listAllOrdersPending(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("orders/delivered")
    public ResponseEntity<> listAllOrdersDelivered(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("orders/date")
    public ResponseEntity<> listOrdersInDateRange(@RequestBody){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    }
    @GetMapping("orders/{id}")
    public ResponseEntity<> getOrderById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @PostMapping("orders")
    public ResponseEntity<> createNewOrder(@RequestBody){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @PutMapping("orders")
    public ResponseEntity<> updateOrderStatus(@RequestBody){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @DeleteMapping("orders")
    public ResponseEntity<> deleteOrder(@RequestBody){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}

    @GetMapping("customers")
    public ResponseEntity<>listAllCustomers(){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("customers/{customer}")
    public ResponseEntity<>findCustomers(@PathVariable String customer){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @PutMapping("customers/{id}")
    public ResponseEntity<>createNewCustomer(){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}



}
