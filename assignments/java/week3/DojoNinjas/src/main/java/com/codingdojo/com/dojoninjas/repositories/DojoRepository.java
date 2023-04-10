package com.codingdojo.com.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.dojoninjas.Models.DojoModel;
@Repository
public interface DojoRepository extends CrudRepository<DojoModel, Long>{
	List<DojoModel> findAll();
}
