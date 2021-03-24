package mx.sistemadecorreo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mx.sistemadecorreo.modelo.Usuario;

@Controller
public class Login 
{
	ModelAndView modelAndView= new ModelAndView();
	
	@GetMapping("login")
	public ModelAndView mostrarVista()
	{
		return new ModelAndView("login");
	}
	
	@PostMapping("logear")
	public void logearse(Usuario usuario) 
	{
		System.out.println(usuario.getCorreo() + usuario.getPassword());
		
	}

}
