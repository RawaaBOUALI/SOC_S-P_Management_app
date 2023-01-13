package org.sid.professorservice.controller;
/*package org.sid.customerservice.controller;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.sid.customerservice.entities.Professor;
import org.sid.customerservice.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfessorController {
	
	  @Autowired
	    private ProfessorRepository professorRepository;
    
    @GetMapping("/professors")
    public String professors(Model model){
        model.addAttribute("professors",professorRepository.findAll());
        return "professors";
    }
    
	@GetMapping("/professors/{id}")
	public String deleteProfessor(@PathVariable Long id) {
		professorRepository.deleteById(id);
		return "redirect:/professors";
	}

	@PostMapping("/professors")
	public String saveProfessor(@ModelAttribute("professor") Professor professor) {
		professorRepository.save(professor);
		return "redirect:/professors";
	}
	
	@GetMapping("/professors/new")
	public String createProfessorForm(Model model) {
		
		// create student object to hold student form data
		Professor professor = new Professor();
		model.addAttribute("professor", professor);
		return "create_professor";
		
	}
	
	@GetMapping("/professors/edit/{id}")
	public String editProfessorForm(@PathVariable("id") long id, Model model) {
		Professor professor = professorRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid professor Id:" + id));
		model.addAttribute("professor", professor);
		return "edit_professor";
	}
	
	
	@PostMapping("/professors/{id}")
	public String updateProfessor(@PathVariable long id,
			@ModelAttribute("professor") Professor professor,
			Model model) {
		professorRepository.saveAndFlush(professor);
		return "redirect:/professors";		
	}

}*/
