package com.wild.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // аннотация - класс является контроллером
@RequestMapping("/employee") // связывает URL адрес контроллера
public class MyController {

    @RequestMapping("/") // связывает URL адрес методом контроллера
    public String showFirstView(){
        return "first-view"; // ссылка на first-view.jsp
    }


    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

//        Employee emp = new Employee();
//        emp.setName("Bill");
//        emp.setSurName("Bobson");
//        emp.setSalary(500);


        model.addAttribute("employee", new Employee()); // emp

        return "ask-emp-details-view"; }


        @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp){

        String name = emp.getName();
        emp.setName("Mr. " + name);

        String surName = emp.getSurName();
        emp.setSurName(surName + "!");

        int salary = emp.getSalary();
        emp.setSalary(salary * 2);

        return "show-emp-details-view"; }


}
