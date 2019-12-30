package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.CollectionMapper;
import edu.swjtuhc.demo.model.CollectionModel;
import edu.swjtuhc.demo.service.CollectionService;


@Service
public class CollectionServiceImpl implements CollectionService{
	@Autowired
	CollectionMapper collectionmapper;
	@Override
	public List<CollectionModel> getCollectionList() {
		// TODO Auto-generated method stub
		return collectionmapper.selectAllCollection();
	}


}
