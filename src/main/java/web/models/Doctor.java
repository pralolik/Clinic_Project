package web.models;

/**
 * Created by pralolikPC on 12/02/2017.
 */
public class Doctor {
    private Long doctor_id;
    private String doctor_name;
    private String doctor_second_name;


    public Doctor(Long doctor_id, String doctor_name, String doctor_second_name) {
        this.doctor_id = doctor_id;
        this.doctor_name = doctor_name;
        this.doctor_second_name = doctor_second_name;
    }

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_second_name() {
        return doctor_second_name;
    }

    public void setDoctor_second_name(String doctor_second_name) {
        this.doctor_second_name = doctor_second_name;
    }
}
