package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalController {
    private final CalService service;


    public CalController(CalService service) {
        this.service=service;
    }
    @GetMapping
    public String calculator() {
        return service.calculator();
    }

    @GetMapping (path= "/calculator/plus")
    public String plusCalculator (@RequestParam (value = "num1", required = false) Integer num1,
                                  @RequestParam (value = "num2", required = false) Integer num2)
    {
        return service.plusCalculator(num1, num2);
    }
    @GetMapping (path= "/calculator/minus")
    public String minusCalculator (@RequestParam (value = "num1", required = false) Integer num1,
                                   @RequestParam (value = "num2", required = false) Integer num2){

        return service.minusCalculator(num1, num2);
    }
    @GetMapping (path= "/calculator/multiply")
    public String multiplyCalculator (@RequestParam (value = "num1", required = false) Integer num1,
                                      @RequestParam (value = "num2", required = false) Integer num2) {
        return service.multiplyCalculator(num1, num2);
    }
    @GetMapping (path= "/calculator/divide")
    public String divideCalculator (@RequestParam (value = "num1", required = false) Integer num1,
                                    @RequestParam (value = "num2", required = false) Integer num2) {
        return service.divideCalculator(num1, num2);
    }
}
