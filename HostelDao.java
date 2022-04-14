package com.motivity.dao;

import com.motivity.entities.Hostel;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface HostelDao {
       void add(Hostel hostel);
       void delete(Hostel hostel);
       void update(Hostel hostel);
        List<Hostel> select();
}

