package com.solera.proyecto.semana6.contacto;

import com.solera.proyecto.semana6.oporClient.OporClient;
import com.solera.proyecto.semana6.oporClient.OporClientDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ContactoDAO {

    private static int idContactos = 0;
    List<Contacto> contactos = new ArrayList<>();

    public List<Contacto> getContactos() {
        return contactos;
    }

    public Contacto getContactoId(Integer id) {
        Predicate<? super Contacto> predicate = contact -> contact.getId() == id;
        return contactos.stream().filter(predicate).findFirst().get();
    }

    public Contacto crearContacto(Contacto contacto, Integer idOdorClient){
        try{
            OporClientDAO oporClientDAO = new OporClientDAO();
            contacto.setId(++idContactos);
            OporClient newOporClient = oporClientDAO.getClientId(idOdorClient);
            contacto.setNameOporCliente(newOporClient.name);
            contacto.setIdOporCliente(idOdorClient);
            newOporClient.getContacts().add(contacto);
            contactos.add(contacto);
        }catch(Exception e){
            e.printStackTrace();
        }
        return contacto;
    }

    public boolean borrarContacto(Integer id){
        Contacto contacto = getContactoId(id);
        OporClientDAO oporClientDAO =new OporClientDAO();
        if (oporClientDAO.getClientId(contacto.getIdOporCliente()).getContacts().remove(contacto))
            if (contactos.remove(contacto))
                return true;

        return false;
    }

}
