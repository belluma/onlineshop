package demo.onlineshop.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shop")
public class ShopController {

    @GetMapping
    public ResponseEntity<String> getMainView(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("category")
    public ResponseEntity<String>getCategoryView(@RequestParam String category){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @GetMapping("details")
    public ResponseEntity<String>getDetailsView(@RequestParam String productId){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("basket")
    public ResponseEntity<String> getBasketView(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
    @PutMapping
    public ResponseEntity<String> addToBasket(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }


}
