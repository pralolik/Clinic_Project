package web.dao;

import web.models.Doctor;

import java.util.List;

/**
 * Created by pralolikPC on 12/02/2017.
 */
public interface DoctorDAO {
    Doctor getDoctorById(Long doctor_id);
    List<Doctor> getAllDoctors();
}
