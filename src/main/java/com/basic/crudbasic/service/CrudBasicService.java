package com.basic.crudbasic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.crudbasic.data.CrudBasicDTO;
import com.basic.crudbasic.data.CrudBasicRepository;

@Service
public class CrudBasicService {

	@Autowired
	private CrudBasicRepository crudBasicRepository;
	
	public CrudBasicDTO getCrudBasic(Integer id){
		return crudBasicRepository.findById(id).get();
	
	}
	
	public CrudBasicDTO saveCrudBasic(CrudBasicDTO crudBasicDTO){
		return crudBasicRepository.save(crudBasicDTO);
	
	}
	
	
}
