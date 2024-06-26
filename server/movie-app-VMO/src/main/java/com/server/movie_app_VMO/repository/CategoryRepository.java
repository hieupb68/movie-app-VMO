package com.server.movie_app_VMO.repository;

import com.server.movie_app_VMO.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
