package com.reto3.modelo;

/**
 *
 * @author Santiago Garcia
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
public class Client implements Serializable {
    /**
     * Atributo ID Client
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer idClient;
    /**
     * Atributo Email Client
     */
    @Column(name = "email")
    private String email;
    /**
     * Atributo Contraseña Cliente
     */
    @Column(name = "password")
    private String password;
    /**
     * Atributo Name Client
     */
    @Column(name = "name")
    private String name;
    /**
     * Atributo Edad Cliente
     */
    @Column(name = "age")
    private int age;

    /**
     * Relacion uno a muchos Tabla Message
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Message> messages;

    /**
     * Relacion uno a muchos Tabla Reservation
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Reservation> reservations;

    // Getter and Setter

    /**
     * Getter ID Client
     * @return
     */
    public Integer getIdClient() {
        return idClient;
    }

    /**
     * Setter ID Client
     *
     * @param idClient
     */
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    /**
     * Getter Name Client
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter Name Client
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter Email Client
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter Email Client
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter Age Client
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter Age Client
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter Password Client
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter Password Client
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter Message Client
     * @return
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * Setter Message Client
     * @param messages
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    /**
     * Getter Reservation Client
     * @return
     */
    public List<Reservation> getReservations() {
        return reservations;
    }

    /**
     * Setter Reservation Client
     * @param reservations
     */
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
