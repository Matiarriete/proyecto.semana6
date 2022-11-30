package com.solera.proyecto.semana6.contacto;

import com.solera.proyecto.semana6.oporClient.OporClient;
import com.solera.proyecto.semana6.oporClient.OporClientDAO;

import java.util.List;

public class ContactoDAO {

    private static int idContactos = 0;
    List<Contacto> contactos;

    public List<Contacto> getContactos() {
        return contactos;
    }

    public Contacto crearContacto(Contacto contacto, int id){
        try{
            System.out.println(contacto.toString());
            OporClientDAO oporClientDAO = new OporClientDAO();
            contacto.setId(++idContactos);
            OporClient oporClient = oporClientDAO.getClientId(id);
            List<Contacto> list = oporClient.getContacts();
            list.add(contacto);
        }catch(Exception e){
            e.printStackTrace();
        }
        return contacto;
    }

}
