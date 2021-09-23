package demo.onlineshop.controller;

import demo.onlineshop.model.TestModel;
import demo.onlineshop.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @GetMapping("/test")
    public String listAll(Model model){
        List<TestModel> listtest = testRepository.findAll();
        model.addAttribute("listTest", listtest);

        return "test";
    }
}
