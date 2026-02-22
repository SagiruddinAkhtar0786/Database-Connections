package com.database.JpaConnection.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.JpaConnection.Repository.StaffRepo;
import com.database.JpaConnection.entity.Staff;

@Service
public class StaffService {

	@Autowired
	private StaffRepo stafRepo;
	
	public List<Staff> getAllStaff(){
		return stafRepo.findAll();
	}
	
	public Staff createStaffDetails(Staff staffDetail){
		return stafRepo.save(staffDetail);
	}
}
