package com.basic.crudbasic.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudBasicRepository extends CrudRepository<CrudBasicDTO, Integer>{
	
	//Basic Implementations have their functionalities

}
