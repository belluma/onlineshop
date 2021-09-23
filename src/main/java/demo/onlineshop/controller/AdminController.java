package demo.onlineshop.controller;

import demo.onlineshop.model.Order;
import demo.onlineshop.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping("products")
    public ResponseEntity<String> listAllProducts(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("products/in_stock")
    public ResponseEntity<String> listAllProductsInStock(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("products/out_of_stock")
    public ResponseEntity<String> listAllProductsOutOfStock(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("products/order_pending")
    public ResponseEntity<String> listAllProductsReordered(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @PostMapping("products")
    public ResponseEntity<String>createNewProduct(@RequestBody  Product product ){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @PutMapping("products")
    public ResponseEntity<String>updateProduct(@RequestBody  Product product ){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @DeleteMapping("products")
    public ResponseEntity<String>deleteProduct(@RequestBody Product product ){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("orders")
    public ResponseEntity<String> listAllOrders(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("orders/pending")
    public ResponseEntity<String> listAllOrdersPending(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("orders/delivered")
    public ResponseEntity<String> listAllOrdersDelivered(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("orders/date")
    public ResponseEntity<String> listOrdersInDateRange(@RequestBody Order order){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}

    @GetMapping("orders/{id}")
    public ResponseEntity<String> getOrderById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @PostMapping("orders")
    public ResponseEntity<String> createNewOrder(@RequestBody Order order){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @PutMapping("orders")
    public ResponseEntity<String> updateOrderStatus(@RequestBody Order order){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @DeleteMapping("orders")
    public ResponseEntity<String> deleteOrder(@RequestBody Order order){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}

    @GetMapping("customers")
    public ResponseEntity<String>listAllCustomers(){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @GetMapping("customers/{customer}")
    public ResponseEntity<String>findCustomers(@PathVariable String customer){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
    @PutMapping("customers/{id}")
    public ResponseEntity<String>createNewCustomer(){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}



}
