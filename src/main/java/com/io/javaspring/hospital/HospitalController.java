package com.io.javaspring.hospital;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
	
	@Autowired
	public HospitalService hospitalService;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/healthcare")
	public List<Hospital> getAllHospital(){
		return hospitalService.getAllHospital();
	}
	
	@RequestMapping("/healthcare/{patientid}")
	public Hospital getHospital(@PathVariable String patientid) {
		return hospitalService.getHospital(patientid);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/healthcare")
	public void addHospital(@RequestBody Hospital hospital) {
		hospitalService.addHospital(hospital);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/healthcare")
	public void updateHospital(@RequestBody Hospital hospital) {
		hospitalService.updateHospital(hospital);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/healthcare/{hospitalId}")
	public void deleteHospital(@PathVariable String  hospitalId) {
		hospitalService.deleteHospital(hospitalId);
	}

}