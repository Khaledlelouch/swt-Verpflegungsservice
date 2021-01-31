package com.SW1.verpflegungService.DatabaseController;
import com.SW1.verpflegungService.model.Patient;
import com.SW1.verpflegungService.model.PatientDTO;
import com.SW1.verpflegungService.model.Station;
import com.SW1.verpflegungService.model.Zimmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DatenbankController {

	@Autowired
	PatientRepository patientRepository;
	@Autowired
	ZimmerRepository zimmerRepository;
	@Autowired
	StationRepository stationRepository;

	public PatientDTO savePatient(PatientDTO patientDTO) {
		Patient toSavePatient =new Patient();
		Zimmer toSaveZimmer = new Zimmer();
		Station toSaveStation= new Station();

		toSaveZimmer.setZimmerNr(patientDTO.getZimmerNr());
		zimmerRepository.save(toSaveZimmer);

		toSaveStation.setStationNr(patientDTO.getStationNr());
		stationRepository.save(toSaveStation);

		toSavePatient.setVorname(patientDTO.getVorname());
		toSavePatient.setNachname(patientDTO.getNachname());
		toSavePatient.setAllergien(patientDTO.getAllergien());
		toSavePatient.setEinzugsDatum(patientDTO.getEinzugsDatum());
		toSavePatient.setErnaehrungstyp(patientDTO.getErnaehrungstyp());
		toSavePatient.setGeburtstag(patientDTO.getGeburtstag());
		toSavePatient.setHausnr(patientDTO.getHausnr());
		toSavePatient.setMobilnummer(patientDTO.getMobilnummer());
		toSavePatient.setOrt(patientDTO.getOrt());
		toSavePatient.setStrasse(patientDTO.getStrasse());
		toSavePatient.setErkrankung(patientDTO.getErkrankung());
		toSavePatient.setPostleitzahl(patientDTO.getPostleitzahl());
		toSavePatient.setZimmerEntity(toSaveZimmer);
		toSavePatient.setStationEntity(toSaveStation);
		patientRepository.save(toSavePatient);




		return patientDTO;
	}


	public List<PatientDTO> getPatientListe() {
		List<Patient> patientList= patientRepository.findAll();
		ArrayList<PatientDTO> patientDTOList = new ArrayList<PatientDTO>();
		PatientDTO patientDTO = new PatientDTO();
		if(!patientList.isEmpty()){
			for(int i=0; i<patientList.size(); i++){
				patientDTO.setId(patientList.get(i).getId());
				patientDTO.setVorname(patientList.get(i).getVorname());
				patientDTO.setZimmerNr(patientList.get(i).getZimmerEntity().getZimmerNr());
				patientDTO.setNachname(patientList.get(i).getNachname());
				patientDTO.setAllergien(patientList.get(i).getAllergien());
				patientDTO.setEinzugsDatum(patientList.get(i).getEinzugsDatum());
				patientDTO.setErnaehrungstyp(patientList.get(i).getErnaehrungstyp());
				patientDTO.setGeburtstag(patientList.get(i).getGeburtstag());
				patientDTO.setHausnr(patientList.get(i).getHausnr());
				patientDTO.setMobilnummer(patientList.get(i).getMobilnummer());
				patientDTO.setOrt(patientList.get(i).getOrt());
				patientDTO.setStrasse(patientList.get(i).getStrasse());
				patientDTO.setErkrankung(patientList.get(i).getErkrankung());
				patientDTO.setPostleitzahl(patientList.get(i).getPostleitzahl());
				patientDTO.setStationNr(patientList.get(i).getStationEntity().getStationNr());
				patientDTOList.add(patientDTO);
			}
			return patientDTOList;
		}
		else{
			return null;
		}
	}

	public PatientDTO getPatientById(long id){
		PatientDTO toReadPatientDTO = new PatientDTO();
		Optional<Patient> foundPatient = patientRepository.findById(id);
		if(foundPatient.isPresent()){

			toReadPatientDTO.setVorname(foundPatient.get().getVorname());
			toReadPatientDTO.setNachname(foundPatient.get().getNachname());
			toReadPatientDTO.setAllergien(foundPatient.get().getAllergien());
			toReadPatientDTO.setEinzugsDatum(foundPatient.get().getEinzugsDatum());
			toReadPatientDTO.setErnaehrungstyp(foundPatient.get().getErnaehrungstyp());
			toReadPatientDTO.setGeburtstag(foundPatient.get().getGeburtstag());
			toReadPatientDTO.setHausnr(foundPatient.get().getHausnr());
			toReadPatientDTO.setMobilnummer(foundPatient.get().getMobilnummer());
			toReadPatientDTO.setOrt(foundPatient.get().getOrt());
			toReadPatientDTO.setStrasse(foundPatient.get().getStrasse());
			toReadPatientDTO.setErkrankung(foundPatient.get().getErkrankung());
			toReadPatientDTO.setPostleitzahl(foundPatient.get().getPostleitzahl());
			toReadPatientDTO.setZimmerNr(foundPatient.get().getZimmerEntity().getZimmerNr());
			toReadPatientDTO.setStationNr(foundPatient.get().getStationEntity().getStationNr());

			return toReadPatientDTO;
		}
		else return null;
	}

	public List<Patient> getSearchedPatientList(String name){
		return patientRepository.findListOfPatient(name);
	}


	public void deletePatient(long id){
		Optional<Patient> toDeletePatient = patientRepository.findById(id);
		if(toDeletePatient.isPresent()){
			patientRepository.deleteById(id);}

	}

	public Patient updatePatient(long id, Patient patient)  throws Exception {
		Optional<Patient> toUpdatePatient = patientRepository.findById(id);
		if(toUpdatePatient.isPresent()){
			toUpdatePatient.get().setPostleitzahl(patient.getPostleitzahl());
			toUpdatePatient.get().setStrasse(patient.getStrasse());
			toUpdatePatient.get().setErnaehrungstyp(patient.getErnaehrungstyp());
			toUpdatePatient.get().setOrt(patient.getOrt());
			toUpdatePatient.get().setHausnr(patient.getHausnr());
			toUpdatePatient.get().setMobilnummer(patient.getMobilnummer());
			toUpdatePatient.get().setEinzugsDatum(patient.getEinzugsDatum());
			toUpdatePatient.get().setAllergien(patient.getAllergien());
			toUpdatePatient.get().setGeburtstag(patient.getGeburtstag());
			toUpdatePatient.get().setNachname(patient.getNachname());
			toUpdatePatient.get().setVorname(patient.getVorname());
			patientRepository.save(toUpdatePatient.get());
			return  toUpdatePatient.get();
		}
		else{
			throw new Exception();
		}
	}
}
