package com.promanage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.promanage.modal.Project;
import com.promanage.modal.User;

public interface ProjectRepository extends JpaRepository<Project, Long>{
//	List<Project>findByOwner(User user);
	
	List<Project> findByNameContainingAndTeamContains(String partialName, User user);
	
//	@Query("SELECT p from Project p join p.team t where t=:user")
//	List<Project> findProjectByTeam(@Param("user") User user);
	
	List<Project>findByTeamContainingOrOwner(User user, User owner);
}
