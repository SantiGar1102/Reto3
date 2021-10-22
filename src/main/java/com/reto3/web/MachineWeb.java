package com.reto3.web;

import com.reto3.modelo.Machine;
import com.reto3.service.MachineApi;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Santiago Garcia
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Machine/")
public class MachineWeb {
    @Autowired
    private MachineApi machineApi;

    @GetMapping("all")
    public List<Machine> getMachine(){
        return machineApi.getAll();
    }

    @GetMapping("{id}")
    public Optional<Machine> getMachine(@PathVariable("id") int id){
        return machineApi.getMachine(id);
    }
    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine machine){
        return machineApi.save(machine);
    }

    /**
    // Creado para eliminar y editar las listas
    @GetMapping("delete")
    public String eliminar(@PathVariable("id") Integer idMachine){
        machineApi.eliminar(idMachine);
        return "redirect:/machineWeb/";
    }

    public String editar (@PathVariable int id, Model model){
        Optional<>
    }
    */
}

