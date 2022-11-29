package com.solera.proyecto.semana6.oporClient;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OporClientDAO {

    static List<OporClient> oporClients = new ArrayList<>();

    private static int oporClientCount = 0;

    static {
        oporClients.add(new OporClient(null, false, ++oporClientCount, "Prueba", "pruebna@gmail.com", "1685a8231356", false));
    }

    public List<OporClient> getOportunidades() {
        Predicate<? super OporClient> predicate = oporClient -> !oporClient.getClient() && !oporClient.isDelete();
        return oporClients.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<OporClient> getClientes() {
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getClient() && !oporClient.isDelete();
        return oporClients.stream().filter(predicate).collect(Collectors.toList());
    }

    public OporClient crearOportunidad(OporClient oportunidad){
        oportunidad.setId(++oporClientCount);
        oporClients.add(oportunidad);
        return oportunidad;
    }

    public OporClient oporToCliente(int oporId){
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getId().equals(oporId);
        OporClient oporClient = oporClients.stream().filter(predicate).findFirst().get();
        oporClient.setClient(true);
        return oporClient;
    }

    public OporClient borrarOportunidad(int oporId){
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getId().equals(oporId);
        OporClient oporClient = oporClients.stream().filter(predicate).findFirst().get();
        oporClient.setDelete(true);
        return oporClient;
    }

    public OporClient borrarCliente(int oporId){
        Predicate<? super OporClient> predicate = oporClient -> oporClient.getId().equals(oporId);
        OporClient oporClient = oporClients.stream().filter(predicate).findFirst().get();
        oporClient.setDelete(true);
        return oporClient;
    }
}
