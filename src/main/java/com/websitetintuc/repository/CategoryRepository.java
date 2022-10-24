package com.websitetintuc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitetintuc.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
