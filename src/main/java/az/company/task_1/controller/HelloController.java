package az.company.task_1.controller;

import az.company.task_1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @Autowired
    private  HelloService helloService;

    @GetMapping
    public void getHello()
    {
        helloService.sayHello();
    }
}
