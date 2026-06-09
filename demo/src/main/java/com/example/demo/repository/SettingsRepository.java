package com.example.demo.repository;

import com.example.demo.entity.Settings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingsRepository
        extends JpaRepository<Settings, Long> {

}