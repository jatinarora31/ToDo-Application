package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
