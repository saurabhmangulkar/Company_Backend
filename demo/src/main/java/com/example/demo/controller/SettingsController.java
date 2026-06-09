package com.example.demo.controller;

import com.example.demo.entity.Settings;
import com.example.demo.service.SettingsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/settings")
@CrossOrigin("*")
public class SettingsController {

    @Autowired
    private SettingsService settingsService;

    @PostMapping
    public Settings createSettings(
            @RequestBody Settings settings) {

        return settingsService.createSettings(
                settings);
    }

    @GetMapping
    public List<Settings> getAllSettings() {

        return settingsService.getAllSettings();
    }

    @GetMapping("/{id}")
    public Settings getSettingsById(
            @PathVariable Long id) {

        return settingsService.getSettingsById(id);
    }

    @PutMapping("/{id}")
    public Settings updateSettings(
            @PathVariable Long id,
            @RequestBody Settings settings) {

        return settingsService.updateSettings(
                id,
                settings);
    }

    @DeleteMapping("/{id}")
    public String deleteSettings(
            @PathVariable Long id) {

        settingsService.deleteSettings(id);

        return "Settings Deleted Successfully";
    }
}