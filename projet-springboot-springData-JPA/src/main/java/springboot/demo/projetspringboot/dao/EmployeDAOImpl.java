package springboot.demo.projetspringboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springboot.demo.projetspringboot.entity.Employe;

@Repository
public class EmployeDAOImpl implements EmployeDAO{

private EmployeRepository employeRepository;
	
	@Autowired
	public EmployeDAOImpl(EmployeRepository theEmployeRepository) {
		employeRepository = theEmployeRepository;
	}
	
	@Override
	public List<Employe> attrapezLesTous() {
		return employeRepository.findAll();
	}

	@Override
	public Employe trouverParId(int theId) {
		Optional<Employe> result = employeRepository.findById(theId);
		
		Employe theEmploye = null;
		
		if (result.isPresent()) {
			theEmploye = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employe id - " + theId);
		}
		
		return theEmploye;
	}

	@Override
	public void sauvegarder(Employe theEmployee) {
		employeRepository.save(theEmployee);
	}

	@Override
	public void supprimerParId(int theId) {
		employeRepository.deleteById(theId);
	}
}
