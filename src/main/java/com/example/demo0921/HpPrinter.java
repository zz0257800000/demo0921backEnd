package com.example.demo0921;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component //實作implement 依賴注入IOC 創建 Bean 的方法
public class HpPrinter implements Printer {
	
	
//	@Value("${printer.name}")
//	private String name;
//	
//	@Value("${printer.count:20}")
//	private int count; //設定參數用private開頭
	
//	@PostConstruct  //初始後構造
//	 public void init(){
//		 count = 5;
//	 }
	 //設定方法用public void開頭

  @Override 
  //先從interface設定方法參數,然後在@Component class implement實作之後,在方法上透過@Override 變成Bean 
  //最後在@Controller class 使用@Autowired 將初始化的 Bean帶進來 然後就能執行這個api方法
  public void print(String message) {
  System.out.println("HP印表機" + message);

//	  count--;
//      System.out.println(name + ":" + message);
//      System.out.println("剩餘次數 "+count);
      
  }
}