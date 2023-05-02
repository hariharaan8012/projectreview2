package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.IplModel;
import com.example.demo.Repository.IplRepo;


@Service
public class IplService {

	@Autowired
	public IplRepo irep;
	
	public IplModel saveInfo(IplModel im)
	{
		return irep.save(im);
	}
	
}