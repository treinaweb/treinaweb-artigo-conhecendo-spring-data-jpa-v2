package br.com.treinaweb.twprojects.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojects.core.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
