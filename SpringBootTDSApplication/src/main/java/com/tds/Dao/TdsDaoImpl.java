package com.tds.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.tds.Model.TdsMaster;


@Component("dao")
@Repository //it is used to identify for CRUD operations
@ComponentScan("com.tds")

public class TdsDaoImpl implements TdsDao{

	@PersistenceContext
	EntityManager entityManager; //it is used to create the tansaction and session factory objects implicitly
	
	@Override
	public TdsMaster getById(int id) {
		TdsMaster master=entityManager.find(TdsMaster.class, id);
		return master;
	
	}

}
