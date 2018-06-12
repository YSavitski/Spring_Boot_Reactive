package com.example.learning_spring_boot.social_media_platform.controllers;

import com.example.learning_spring_boot.social_media_platform.domain.Chapter;
import com.example.learning_spring_boot.social_media_platform.repository.ChapterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {
    private final ChapterRepository chapterRepository;

    public ChapterController(final ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> getAllChapters() {
        return chapterRepository.findAll();
    }
}
