package com.log.logistics.service;

import com.log.logistics.model.Logistics;
import com.log.logistics.repository.LogisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogisticsService {

    @Autowired
    private LogisticsRepository logisticsRepository;

    public List<Logistics> listarTodos() {
        return logisticsRepository.findAll();
    }

    public Optional<Logistics> obtenerPorId(Long id) {
        return logisticsRepository.findById(id);
    }

    public Logistics guardar(Logistics logistics) {
        return logisticsRepository.save(logistics);
    }

    public void eliminar(Long id) {
        logisticsRepository.deleteById(id);
    }
}