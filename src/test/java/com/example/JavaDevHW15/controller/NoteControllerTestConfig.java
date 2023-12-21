package com.example.JavaDevHW15.controller;

import com.example.JavaDevHW15.data.repository.NoteRepository;
import com.example.JavaDevHW15.service.mapper.NoteMapper;
import com.example.JavaDevHW15.service.service.NoteService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class NoteControllerTestConfig {
    @Bean
    public NoteService service() {
        return new NoteService(repository(), mapper());
    }

    @Bean
    public NoteRepository repository() {
        return new NoteRepository();
    }

    @Bean
    public NoteMapper mapper() {
        return new NoteMapper();
    }
}
