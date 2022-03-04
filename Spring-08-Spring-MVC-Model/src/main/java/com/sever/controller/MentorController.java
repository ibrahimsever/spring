package com.sever.controller;

import com.sever.enums.Gender;
import com.sever.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("mentor")
    public String mentors(Model model){

        List<Mentor> mentorList=new ArrayList<>();

        mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.MALE));
        mentorList.add(new Mentor("Amy","Bryan",25, Gender.FEMALE));
        mentorList.add(new Mentor("Ibrahim","Sever",41, Gender.MALE));

        model.addAttribute("mentor",mentorList);


        return "/student/mentor-list";
    }



}
