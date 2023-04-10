package com.codingdojo.com.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.com.dojoninjas.Models.NinjaModel;

public interface NinjaRepository extends CrudRepository<NinjaModel, Long>{
	List<NinjaModel> findAll();
}
