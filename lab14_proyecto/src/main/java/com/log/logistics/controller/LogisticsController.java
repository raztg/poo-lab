package com.log.logistics.controller;

import com.log.logistics.model.Logistics;
import com.log.logistics.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/logistics")
public class LogisticsController {

    @Autowired
    private LogisticsService logisticsService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("registros", logisticsService.listarTodos());
        return "logistics-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("logistics", new Logistics());
        return "logistics-form";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Logistics logistics = logisticsService.obtenerPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("logistics", logistics);
        return "logistics-form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("logistics") Logistics logistics) {
        logisticsService.guardar(logistics);
        return "redirect:/logistics";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        logisticsService.eliminar(id);
        return "redirect:/logistics";
    }
}