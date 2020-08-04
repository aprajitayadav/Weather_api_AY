package com.win.weatherapp.Repository;

import com.win.weatherapp.model.ZipCode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<ZipCode, Long> {
    public ZipCode findByZip(String zipcode);
}