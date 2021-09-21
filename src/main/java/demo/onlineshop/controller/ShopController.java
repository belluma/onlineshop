package demo.onlineshop.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
