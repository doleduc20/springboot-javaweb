package com.websitetintuc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitetintuc.converter.NewConverter;
import com.websitetintuc.dto.NewDTO;
import com.websitetintuc.entity.CategoryEntity;
import com.websitetintuc.entity.NewEntity;
import com.websitetintuc.repository.CategoryRepository;
import com.websitetintuc.repository.NewRepository;
import com.websitetintuc.service.INewService;

@Service
public class NewService implements INewService{

	
	@Autowired
	private NewRepository newRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private NewConverter converter;

	@Override
	public NewDTO save(NewDTO newDTO) {
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
		NewEntity newEntity = converter.toEntity(newDTO);
		newEntity.setCategory(categoryEntity);
		newEntity = newRepository.save(newEntity);
		
		return converter.toDTO(newEntity);
	}
}
