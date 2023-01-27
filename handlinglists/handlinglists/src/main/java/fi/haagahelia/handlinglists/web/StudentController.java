package fi.haagahelia.handlinglists.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.handlinglists.domain.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@RequestMapping("/hello")
	public String StudentList(Model model) {
		model.addAttribute("students", repository.findAll());
		return "studentlist";
	}
}
