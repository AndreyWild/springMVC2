package com.wild.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller // аннотация - класс является контроллером
@RequestMapping("/employee") // связывает URL адрес контроллера
public class MyController {

    @RequestMapping("/") // связывает URL адрес методом контроллера
    public String showFirstView() {
        return "first-view"; // ссылка на first-view.jsp
    }


    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

//        Employee emp = new Employee();
//        emp.setName("Bill");
//        emp.setSurName("Bobson");
//        emp.setSalary(500);


        model.addAttribute("employee", new Employee()); // emp

        return "ask-emp-details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
                                 BindingResult bindingResult) { // сохраняем информацию об успешности валидации

        /* Работа со значениями в полях */
//        String name = emp.getName();
//        emp.setName("Mr. " + name);
//
//        String surName = emp.getSurName();
//        emp.setSurName(surName + "!");
//
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 2);

        /* Работа с валидаторами */
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else
            return "show-emp-details-view";
    }


}
