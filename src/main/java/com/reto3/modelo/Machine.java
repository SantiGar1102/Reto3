package com.reto3.modelo;

// Importaciones
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Santiago Garcia
 */
@Entity
@Table(name = "machine")
public class Machine implements Serializable {
    /**
     * Atributo Id machine
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idM", nullable = false)
    private Integer id;
    /**
     * Atributo name machine
     */
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Column(name = "year")
    private int year;
    @Column(name = "description")
    private String description;

    /**
     * Relación muchos a uno tabla category
     */
    @ManyToOne
    @JoinColumn (name = "idC")
    @JsonIgnoreProperties("machines")
    private Category category;
    /**
     * Relación uno a muchos tabla message
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "machine")
    @JsonIgnoreProperties({"machine", "client"})
    private List<Message> messages;
    /**
     * Relación uno a muchos tabla reservations
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "machine")
    @JsonIgnoreProperties("machine")
    private List<Reservation> reservations;

    // getters y setters
    /**
     * Getter id machine
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * setter id machine
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter Name Machine
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter Name Machine
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter Brand Machine
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Setter Brand Machine
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter Year Machine
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter Year Machine
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter Description Machine
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter Description Machine
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter Category Machine
     * @return
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Setter Category Machine
     * @param category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Getter Message Machine
     * @return
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * Setter Message Machine
     * @param messages
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    /**
     * Getter Reservation Machine
     * @return
     */
    public List<Reservation> getReservations() {
        return reservations;
    }

    /**
     * Setter Reservation Machine
     * @param reservations
     */
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}

