package com.solera.proyecto.semana6.oporClient;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.OPTIONS, RequestMethod.POST})
public class OporClientController {

    OporClientDAO oporClientDAO = new OporClientDAO();

    @GetMapping("/all")
    public List<OporClient> getAll(){
        return oporClientDAO.getAll();
    }

    @GetMapping("/obtenerId/{id}")
    public OporClient getClientId(@PathVariable int id){
        return oporClientDAO.getClientId(id);
    }
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
        System.out.println("PruebA");
        return oporClientDAO.crearOportunidad(oportunidad);
    }

    @PutMapping("/oporToClient/{oporId}")
    public OporClient oporToCliente(@RequestBody String claveFiscal, @PathVariable(value = "oporId") int oporId){
        return oporClientDAO.oporToCliente(oporId, claveFiscal);
    }

    @PostMapping("/borrarClient/{oporId}")
    public OporClient borrarCliente(@PathVariable int oporId){
        return oporClientDAO.borrarCliente(oporId);
    }

    @PostMapping("/borrarOpor/{oporId}")
    public OporClient borrarOpor(@PathVariable int oporId){
        return oporClientDAO.borrarOportunidad(oporId);
    }
}
