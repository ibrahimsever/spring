package com.sever.controller;

import com.sever.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String home(Model model){

        model.addAttribute("name","Sever");
        model.addAttribute("course","MVC");

        String subject="Collection";
        model.addAttribute("subject",subject);

        int studentId= new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(22);
        numbers.add(46);
        model.addAttribute("numbers",numbers);

        Student student=new Student(1,"Mike","Smith");
        model.addAttribute("student",student);





        return "student/welcome";
    }

}
