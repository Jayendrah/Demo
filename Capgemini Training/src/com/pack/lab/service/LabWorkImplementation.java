package com.pack.lab.service;
import java.util.*;

import com.pack.lab.work.LabWork;

public class LabWorkImplementation implements LabWorkInterface {

	List<LabWork> c2 = new ArrayList<LabWork>();
	
	public void addLabWork(LabWork c1) {
		// TODO Auto-generated method stub
		c2.add(c1);
	}

	public List<LabWork> DisplayLabWork() {
		// TODO Auto-generated method stub
		return c2;
	}

	public boolean searchName(String search) {
		 
	        if(search.equals(c2)) {        	
	        	return true;
	        }
	        else
	        	return false;
	}

		
	}


