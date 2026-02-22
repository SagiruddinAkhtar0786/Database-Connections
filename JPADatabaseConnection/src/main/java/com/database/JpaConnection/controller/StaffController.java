package com.database.JpaConnection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.JpaConnection.Service.StaffService;
import com.database.JpaConnection.entity.Staff;

@RestController
public class StaffController {

	@Autowired
	private StaffService staffService;

	@GetMapping("/getStaff")
	public List<Staff> getStaff() {
		return staffService.getAllStaff();
	}

	@GetMapping("/getStaffDetail")
	public ResponseEntity<List<Staff>> getStaffDetails() {
		return new ResponseEntity<>(staffService.getAllStaff(), HttpStatus.OK);

		/*
		 * List<Staff> staffList = staffService.getAllStaff();
		 * 
		 * if (staffList.isEmpty()) { return ResponseEntity.noContent().build(); }
		 * 
		 * return ResponseEntity.ok(staffList);
		 */
	}

	@PostMapping("/createStaff")
	public Staff createStaffDetails(@RequestBody Staff stafDetal) {
		return (Staff) staffService.createStaffDetails(stafDetal);
	}
}
