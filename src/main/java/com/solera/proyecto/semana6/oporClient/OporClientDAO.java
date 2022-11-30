package com.solera.proyecto.semana6.oporClient;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.google.gson.Gson;
import com.solera.proyecto.semana6.contacto.Contacto;

public class OporClientDAO {

    static List<OporClient> oporClients = new ArrayList<>();
    static List< Contacto > list = new ArrayList<>();
    private static int oporClientCount = 0;

    static {
        oporClients.add(new OporClient(list, false, ++oporClientCount, "Prueba1",
                "pruebna@gmail.com", "1685a8231356", false, ""));
        oporClients.add(new OporClient(list, true, ++oporClientCount, "Prueba2",
                "pruebna@gmail.com", "1685a8231356", false, ""));
    }

    public List<OporClient> getAll(){
        return oporClients;
    }
    public List<OporClient> getOportunidades() {
        Predicate<? super OporClient> predicate = oporClient -> !oporClient.getClient() && !oporClient.isDelete();
        return oporClients.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<OporClient> getClientes() {
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getClient() && !oporClient.isDelete();
        return oporClients.stream().filter(predicate).collect(Collectors.toList());
    }

    public OporClient getClientId(int id){
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getId() == id;
        System.out.println(id);
        return oporClients.stream().filter(predicate).findFirst().get();
    }

    public OporClient crearOportunidad(OporClient oportunidad){
        oportunidad.setId(++oporClientCount);
        oporClients.add(oportunidad);
        return oportunidad;
    }

    public OporClient oporToCliente(int oporId, String claveFiscal){
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getId() == oporId;
        OporClient oporClient = oporClients.stream().filter(predicate).findFirst().get();
        oporClient.setClient(true);
        OporClient data = new Gson().fromJson(claveFiscal, OporClient.class);
        oporClient.setClaveFiscal(data.getClaveFiscal());
        return oporClient;
    }

    public OporClient borrarOportunidad(int oporId){
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getId() == oporId;
        OporClient oporClient = oporClients.stream().filter(predicate).findFirst().get();
        oporClient.setDelete(true);
        return oporClient;
    }

    public OporClient borrarCliente(int oporId){
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getId() == oporId;
        OporClient oporClient = oporClients.stream().filter(predicate).findFirst().get();
        oporClient.setDelete(true);
        return oporClient;
    }
}
