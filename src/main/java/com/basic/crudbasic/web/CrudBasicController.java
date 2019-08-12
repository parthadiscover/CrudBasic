package com.basic.crudbasic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.crudbasic.data.CrudBasicDTO;
import com.basic.crudbasic.service.CrudBasicService;

@RestController
public class CrudBasicController {
	
	
	@Autowired
	private CrudBasicService crudBasicService;
	
	
	
	@GetMapping(path =  "/getCrudBasic/{crudBasicId}" , produces = "application/json")
	CrudBasicDTO getCrudBasic(@PathVariable( "crudBasicId")	Integer id){		
		return crudBasicService.getCrudBasic(id);		
	}
	
	@PutMapping(path="/saveCrudBasic/" , consumes = "application/json", produces = "application/json")
	CrudBasicDTO getCrudBasic(@RequestBody CrudBasicDTO crudBasicDTO){
		return crudBasicService.saveCrudBasic(crudBasicDTO);		
	}

}
