package ma.app.studentsapp.web;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ProfessorController {
	
	@Autowired
	private KeycloakRestTemplate keycloakRestTemplate;
	
	 @GetMapping("/professors")
	    public String professors(Model model){
	        PagedModel<Professor> pageProfessors=
	                keycloakRestTemplate.getForObject("http://localhost:8081/professors",PagedModel.class);
	        model.addAttribute("professors",pageProfessors);
	        return "professors";
	    }
	

	    @ExceptionHandler(Exception.class)
	    public String exceptionHandler(Exception e, Model model){
	        model.addAttribute("errorMessage","problème d'autorisation");
	        return "errors";
	    }
	    

}

@Data
class Professor {
	    private Long id;
		private String firstName;
		private String LastName;
		private String speciality;
		private String email;
		private String tel;
}
