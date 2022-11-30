package com.solera.proyecto.semana6.oporClient;

import com.solera.proyecto.semana6.contacto.Contacto;

import java.util.List;

public class OporClient {

    public List<Contacto> contacts;
    public Boolean isClient;
    public Integer id;
    public String name;
    public String mail;
    public String phoneNumber;
    public boolean isDelete;
    public String claveFiscal;


    public OporClient(List<Contacto> contacts, Boolean isClient, Integer id, String name, String mail, String phoneNumber, boolean isDelete, String claveFiscal) {
        this.contacts = contacts;
        this.isClient = isClient;
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.isDelete = isDelete;
        this.claveFiscal = claveFiscal;
    }

    public OporClient() {
    }

    public List<Contacto> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacto> contacts) {
        this.contacts = contacts;
    }

    public Boolean getClient() {
        return isClient;
    }

    public void setClient(Boolean client) {
        isClient = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getClaveFiscal() {
        return claveFiscal;
    }

    public void setClaveFiscal(String claveFiscal) {
        this.claveFiscal = claveFiscal;
    }

    @Override
    public String toString() {
        return "OporClient{" +
                "contacts=" + contacts +
                ", isClient=" + isClient +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isDelete=" + isDelete +
                ", claveFiscal='" + claveFiscal + '\'' +
                '}';
    }
}
