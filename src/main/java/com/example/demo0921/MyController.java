package com.example.demo0921;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
@Autowired //�۰ʳs�u  �N��l�ƪ�Printer������ Bean�a�i��
//@Qualifier("yourPrinter")
    private Printer printer; //  Printer��printer�ܼ�


    @RequestMapping("/test")//URL  http://localhost:8080/test
    public String test(){
        printer.print("Hello World");//�bconsole���
        return "Hell World"; //localhost���
    }

}