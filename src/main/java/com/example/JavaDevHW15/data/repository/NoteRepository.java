package com.example.JavaDevHW15.data.repository;

import com.example.JavaDevHW15.data.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
}
