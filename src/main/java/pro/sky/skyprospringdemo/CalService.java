package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class CalService {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plusCalculator (Integer num1, Integer num2) {
        if (num1 == null || num2 == null || num1==null && num2==null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else {
            return num1 + "+" + num2 + "=" + (num1 + num2);
        }
    }
    public String minusCalculator (Integer num1,  Integer num2) {
        if (num1 == null || num2 == null || num1 == null && num2 == null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else {
            return num1 + "-" + num2 + "=" + (num1 - num2);
        }
    }
    public String multiplyCalculator (Integer num1,  Integer num2) {
        if (num1 == null || num2 == null || num1==null && num2==null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else {
            return num1 + "*" + num2 + "=" + (num1*num2);
        }
    }
    public String divideCalculator (Integer num1,  Integer num2) {
        if (num1 == null || num2 == null || num1==null && num2==null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else if (num2==0) {
            return "ОШИБКА!!! на 0 делить нельзя!!!";
        } else {
            return num1 + "/" + num2 + "=" + num1/num2;
        }
    }
}

