package com.example.demo.service;

import com.example.demo.entity.Settings;

import java.util.List;

public interface SettingsService {

    Settings createSettings(Settings settings);

    List<Settings> getAllSettings();

    Settings getSettingsById(Long id);

    Settings updateSettings(Long id, Settings settings);

    void deleteSettings(Long id);
}