package demo.onlineshop.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shop")
public class ShopController {

    @GetMapping
    public ResponseEntity<> getMainView(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("category")
    public ResponseEntity<>getCategoryView(@RequestParam String category){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("details")
    public ResponseEntity<>getDetailsView(@RequestParam String productId){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("basket")
    public ResponseEntity<> getBasketView(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PutMapping
    public ResponseEntity<> addToBasket(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

}
