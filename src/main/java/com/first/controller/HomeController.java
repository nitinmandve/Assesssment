package com.first.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.entities.Student;
import com.first.entities.Subject;
import com.first.repository.StudentRepository;
import com.first.repository.SubjectRepository;
import com.first.service.StudentService;
import com.first.service.SubjectService;


@Controller
public class HomeController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SubjectService subjectService;

	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("student",new Student());
		
		return "signup";
	}
	
	@PostMapping("/do_register")
	public String registerUser(@ModelAttribute("student") Student student, Model model ) {
		
		
		Student saveStudent = studentService.saveStudent(student);
		
		
		return"redirect:/signup";
		
	}
	
	@GetMapping("/add-subject")
	public String addSubjectForm(Model model) {
		
		model.addAttribute("subject",new Subject());
		
		return "add_subject";
	}
	
	@PostMapping("/process-subject")
	public String processSubject(@ModelAttribute Subject subject,Model model) {
		
		Subject save = subjectService.saveStudent(subject);
		model.addAttribute("subject",save);
		
		
		
		return "redirect:/add_subject";
	}
	
	
	@GetMapping("/showStudent")
	public String showStudents(Model model) {
		
		List<Student> allstudent = studentService.getAllEmp();
		model.addAttribute("student",allstudent);
		
		return "show_student";
	}
	
	@GetMapping("/showSubject")
	public String showSubject(Model model) {
		
		List<Subject> allSubject = subjectService.getAllEmp();
		model.addAttribute("subject",allSubject);
		
		return "show_subject";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
