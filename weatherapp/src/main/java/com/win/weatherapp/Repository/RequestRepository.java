package com.win.weatherapp.Repository;

import com.win.weatherapp.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}