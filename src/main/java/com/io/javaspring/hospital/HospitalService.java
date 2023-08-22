package com.io.javaspring.hospital;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService{
	
	@Autowired
	public HospitalRepository hospitalRepository;

		public List<Hospital> getAllHospital() {
			List<Hospital> hospital=new ArrayList<>();
			hospitalRepository.findAll().forEach(hospital::add);
			return hospital;
		}
		
		@SuppressWarnings("deprecation")
		public Hospital getHospital(String id) {
			return hospitalRepository.getOne(id);
		}
		
		public void addHospital(Hospital hospital) {
			hospitalRepository.save(hospital);
			//return hospital;
		}
		
		public void updateHospital(Hospital hospital) {
			hospitalRepository.save(hospital);
		}
		
		public void deleteHospital(String hospitalId) {
			hospitalRepository.deleteById(hospitalId);
		}
	}
