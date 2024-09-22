package com.example.demo0921;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
@Autowired //自動連線  將初始化的Printer類型的 Bean帶進來
//@Qualifier("yourPrinter")
    private Printer printer; //  Printer的printer變數


    @RequestMapping("/test")//URL  http://localhost:8080/test
    public String test(){
        printer.print("Hello World");//在console顯示
        return "Hell World"; //localhost顯示
    }

}