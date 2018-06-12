package com.example.learning_spring_boot.social_media_platform.repository;

import com.example.learning_spring_boot.social_media_platform.domain.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
