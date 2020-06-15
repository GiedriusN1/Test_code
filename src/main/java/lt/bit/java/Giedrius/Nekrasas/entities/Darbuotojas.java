package lt.bit.java.Giedrius.Nekrasas.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Year;
import java.util.List;

 /** Author: Giedrius Nekrašas
  *
  */

@Entity
@Table(name = "darbuotojai")

/**
 * Entity Darbuotojas
 * Apraso duomenu struktura duomenu bazes lenteleje darbuotojai
 */
public class Darbuotojas {

    @Id
    private int id;
    private String vardas;
    private String pavarde;
    @Column(name = "gimimo_metai")
    private Integer gm;
    private String pareigos;
    private String skyrius;

    public Darbuotojas()
    {}

    public Darbuotojas(int id, String vardas, String pavarde, Integer gm, String pareigos, String skyrius) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gm = gm;
        this.pareigos = pareigos;
        this.skyrius = skyrius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Integer getGm() {
        return gm;
    }

    public void setGm(Integer gm) {
        this.gm = gm;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }

    public String getSkyrius() {
        return skyrius;
    }

    public void setSkyrius(String skyrius) {
        this.skyrius = skyrius;
    }
}

