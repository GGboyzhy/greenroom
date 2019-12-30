package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.CollectionModel;
import edu.swjtuhc.demo.service.CollectionService;

@RestController
@RequestMapping("/Collection")
public class CollectionController {
	@Autowired
	CollectionService collectionservice;
	
	@RequestMapping("/getList")
	public List<CollectionModel> getList(){
		return collectionservice.getCollectionList();
	}
}
