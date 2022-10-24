package com.websitetintuc.converter;

import org.springframework.stereotype.Component;

import com.websitetintuc.dto.NewDTO;
import com.websitetintuc.entity.NewEntity;

@Component
public class NewConverter {
	public NewEntity toEntity(NewDTO dto) {
		NewEntity newEntity = new NewEntity();
		newEntity.setTitle(dto.getTitle());
		newEntity.setContent(dto.getContent());
		newEntity.setShortDescription(dto.getShortDescription());
		newEntity.setThumbnail(dto.getThumbnail());
		
		return newEntity;
		
	}
	
	public NewDTO toDTO(NewEntity newEntity) {
		NewDTO dto = new NewDTO();
		dto.setTitle(newEntity.getTitle());
		dto.setContent(newEntity.getContent());
		dto.setShortDescription(newEntity.getShortDescription());
		dto.setThumbnail(newEntity.getThumbnail());
		
		return dto;
		
	}
}
