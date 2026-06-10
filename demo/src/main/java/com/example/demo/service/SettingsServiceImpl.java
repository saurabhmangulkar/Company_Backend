package com.example.demo.service;

import com.example.demo.entity.Settings;
import com.example.demo.repository.SettingsRepository;
import com.example.demo.service.SettingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingsServiceImpl
        implements SettingsService {

    @Autowired
    private SettingsRepository settingsRepository;

    @Override
    public Settings createSettings(
            Settings settings) {

        return settingsRepository.save(settings);
    }

    @Override
    public List<Settings> getAllSettings() {

        return settingsRepository.findAll();
    }

    @Override
    public Settings getSettingsById(Long id) {

        return settingsRepository.findById(id)
                .orElse(null);
    }

    
  
    		@Override
    		public Settings getByKey(String key) {

    		    return settingsRepository
    		            .findByKey(key)
    		            .orElse(null);
    		}
    		

    		
    @Override
    public Settings updateSettings(
            Long id,
            Settings settings) {

        Settings existingSettings =
                settingsRepository.findById(id)
                        .orElse(null);

        if (existingSettings != null) {

            existingSettings.setCompanyId(
                    settings.getCompanyId());

            existingSettings.setKey(
                    settings.getKey());

            existingSettings.setValue(
                    settings.getValue());

            return settingsRepository.save(
                    existingSettings);
        }

        return null;
    }

    @Override
    public void deleteSettings(Long id) {

        settingsRepository.deleteById(id);
    }
}