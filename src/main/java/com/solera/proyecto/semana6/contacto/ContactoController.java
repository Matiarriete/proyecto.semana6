package com.solera.proyecto.semana6.contacto;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ContactoController {

    ContactoDAO contactoDAO = new ContactoDAO();

    @GetMapping("/contactos")
    public List<Contacto> getContactos(){
        return contactoDAO.getContactos();
    }
    @PostMapping("/crearContacto/{idOporCliente}")
    public Contacto crearContacto(@RequestBody Contacto contacto, @PathVariable Integer idOporCliente){
        return contactoDAO.crearContacto(contacto, idOporCliente);
    }
    @PostMapping("/contacto/{id}")
    public boolean borrarContacto(@PathVariable Integer id){
        return contactoDAO.borrarContacto(id);
    }


}
