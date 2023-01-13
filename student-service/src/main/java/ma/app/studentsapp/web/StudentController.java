package ma.app.studentsapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ma.app.studentsapp.entities.Student;
import ma.app.studentsapp.repositories.StudentRepository;

@Controller
public class StudentController{
	
    @Autowired
    private StudentRepository studentRepository;
   
    @GetMapping("/home")
    public String index(){
        return "index";
    }
    
    @GetMapping("/students")
    public String students(Model model){
        model.addAttribute("students",studentRepository.findAll());
        return "students";
    }
    
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentRepository.deleteById(id);
		return "redirect:/students";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentRepository.save(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable("id") long id, Model model) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
		model.addAttribute("student", student);
		return "edit_student";
	}
	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable long id,
			@ModelAttribute("student") Student student,
			Model model) {
		studentRepository.saveAndFlush(student);
		return "redirect:/students";		
	}

}

