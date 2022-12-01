package com.solera.proyecto.semana6.contacto;

import com.solera.proyecto.semana6.oporClient.OporClient;
import com.solera.proyecto.semana6.oporClient.OporClientDAO;

import java.util.ArrayList;
import java.util.List;

public class ContactoDAO {

    private static int idContactos = 0;
    List<Contacto> contactos = new ArrayList<>();

    public List<Contacto> getContactos() {
        return contactos;
    }

    public Contacto crearContacto(Contacto contacto){
        try{
            OporClientDAO oporClientDAO = new OporClientDAO();
            contacto.setId(++idContactos);
            oporClientDAO.getClientId(contacto.getIdOporCliente()).getContacts().add(contacto);
            contactos.add(contacto);
        }catch(Exception e){
            e.printStackTrace();
        }
        return contacto;
    }

}
