package com.websitetintuc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.websitetintuc.dto.NewDTO;
import com.websitetintuc.service.INewService;

@RestController
public class NewAPI {
	
	@Autowired
	private INewService newService;
	
    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
            return newService.save(model);
    }
    
    @PutMapping(value = "/new")
    public NewDTO updateNew(@RequestBody NewDTO model) {
    	return model;
    }
    
    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody long[] ids) {
    	
    }
}
