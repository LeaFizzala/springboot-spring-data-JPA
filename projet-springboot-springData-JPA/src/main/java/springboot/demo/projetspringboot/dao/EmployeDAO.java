package springboot.demo.projetspringboot.dao;

import java.util.List;

import org.springframework.context.annotation.Configuration;

import springboot.demo.projetspringboot.entity.Employe;

@Configuration
public interface EmployeDAO  {

	
	public List<Employe> attrapezLesTous();
	
	public Employe trouverParId(int theId);
	
	public void sauvegarder(Employe employe);
	
	public void supprimerParId(int theId);
}
