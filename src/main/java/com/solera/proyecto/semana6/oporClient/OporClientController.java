package com.solera.proyecto.semana6.oporClient;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OporClientController {

    OporClientDAO oporClientDAO = new OporClientDAO();

    @GetMapping("/oportunidades")
    public List<OporClient> getOportunidades(){
        return oporClientDAO.getOportunidades();
    }

    @GetMapping("/clientes")
    public List<OporClient> getClientes(){
        return oporClientDAO.getClientes();
    }

    @PostMapping("/oportunidades")
    public  OporClient crearOportunidades(@RequestBody OporClient oportunidad){
        return oporClientDAO.crearOportunidad(oportunidad);
    }

    @PutMapping("/oporToClient/{oporId}")
    public OporClient oporToCliente(@PathVariable int oporId){
        return oporClientDAO.oporToCliente(oporId);
    }

    @PutMapping("/borrarClient/{oporId}")
    public OporClient borrarCliente(@PathVariable int oporId){
        return oporClientDAO.borrarCliente(oporId);
    }

    @PutMapping("/borrarOpor/{oporId}")
    public OporClient borrarOpor(@PathVariable int oporId){
        return oporClientDAO.borrarOportunidad(oporId);
    }
}
