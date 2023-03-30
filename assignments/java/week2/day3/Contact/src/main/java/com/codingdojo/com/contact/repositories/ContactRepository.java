package com.codingdojo.com.contact.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.contact.models.ContactModel;

@Repository
public interface ContactRepository extends CrudRepository<ContactModel,Long>{
List<ContactModel> findAll();
}
