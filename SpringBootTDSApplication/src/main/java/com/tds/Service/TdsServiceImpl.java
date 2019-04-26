package com.tds.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tds.Dao.TdsDao;
import com.tds.Model.TdsMaster;


@Component("tds")
@Service //it is used to identify the class as service class
@Transactional // it is used to translate the user defined objects to entity manager objects 
public class TdsServiceImpl implements TdsService {

	@Autowired
	TdsDao dao;
	
	@Override
	public TdsMaster getById(int id) {
		
		return dao.getById(id);
	}

}
