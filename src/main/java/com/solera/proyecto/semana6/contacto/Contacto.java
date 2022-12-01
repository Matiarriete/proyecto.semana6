package com.solera.proyecto.semana6.contacto;

import java.time.LocalDate;
import java.util.Date;

public class Contacto {
    public String typeContact;
    public Integer id;
    public String result;
    public LocalDate contactDate;
    public String nameOporCliente;
    public Integer idOporCliente;

    @Override
    public String toString() {
        return "Contacto{" +
                "typeContact='" + typeContact + '\'' +
                ", id=" + id +
                ", result='" + result + '\'' +
                ", contactDate=" + contactDate +
                ", nameOporCliente='" + nameOporCliente + '\'' +
                ", idOporCliente=" + idOporCliente +
                '}';
    }

    public Contacto() {
    }

    public Contacto(String typeContact, Integer id, String result, LocalDate contactDate, String nameOporCliente, Integer idOporCliente) {
        this.typeContact = typeContact;
        this.id = id;
        this.result = result;
        this.contactDate = contactDate;
        this.nameOporCliente = nameOporCliente;
        this.idOporCliente = idOporCliente;
    }

    public Integer getIdOporCliente() {
        return idOporCliente;
    }

    public void setIdOporCliente(Integer idOporCliente) {
        this.idOporCliente = idOporCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDate getContactDate() {
        return contactDate;
    }

    public void setContactDate(LocalDate contactDate) {
        this.contactDate = contactDate;
    }

    public String getNameOporCliente() {
        return nameOporCliente;
    }

    public void setNameOporCliente(String nameOporCliente) {
        this.nameOporCliente = nameOporCliente;
    }
}
