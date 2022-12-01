package com.example.foster_backend.repository;

import com.example.foster_backend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

//
//    @Query("SELECT m from applicants m WHERE m.appointment_scale = 'Medium' ")
//    public List<Client> getByAppointmentMedium();
//
//    @Query("SELECT h from applicants h WHERE h.appointment_scale = 'High' ")
//    public List<Client> getByAppointmentHigh();
//
//    @Query("SELECT w from applicants w WHERE w.program = 'Weekend Sleepovers (2-3 nights)' ")
//    public List<Client> getAllByWeekend();
//
//    @Query("SELECT w from applicants w WHERE w.program = 'Short Term Foster (average of 1-3 weeks)' ")
//    public List<Client> getAllByShort();
//
//    @Query("SELECT w from applicants w WHERE w.program = 'Family Foster (potentially 8-12 weeks)' ")
//    public List<Client> getAllByFamily();

//    @Query("SELECT wnd from applicants wnd WHERE wnd.program = 'Weekend Sleepovers (2-3 nights)' ")
//    public List<Client> findByWeekend(String weekend);
}
