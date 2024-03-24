package kz.bitlab.academy.springfirstsprint.controller;

import kz.bitlab.academy.springfirstsprint.dto.StudentDto;
import kz.bitlab.academy.springfirstsprint.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("students", StudentService.findAll());
        return "index";
    }

    @GetMapping("/add-student-page")
    public String addStudents() {
        return "add-student-page";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute StudentDto studentDto) {
        System.out.println(studentDto);
        StudentService.addStudent(studentDto);
        return "redirect:/";
    }
}
