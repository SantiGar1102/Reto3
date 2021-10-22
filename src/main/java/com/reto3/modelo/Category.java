package com.reto3.modelo;

/**
 *
 * @author Santiago Garcia
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements Serializable {
    /**
     * Atributo ID Category
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idC", nullable = false)
    private Integer id;
    /**
     * Atributo Name Category
     */
    @Column(name = "name")
    private String name;
    /**
     * Atributo Description Category
     */
    @Column(name = "description")
    private String description;
    /**
     * Relacion uno a muchos tabla machine
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Machine> machines;

    // Getters and Setters

    /**
     * Getter ID Category
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter ID Category
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter Name Category
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter Name Category
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter Description Category
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter Description Category
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter Machines Category
     * @return
     */
    public List<Machine> getMachines() {
        return machines;
    }

    /**
     * Setter Machine Category
     * @param machines
     */
    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
