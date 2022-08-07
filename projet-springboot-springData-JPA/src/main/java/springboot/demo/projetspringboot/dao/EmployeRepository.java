package springboot.demo.projetspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.demo.projetspringboot.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
