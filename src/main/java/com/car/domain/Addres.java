package com.car.domain;

import com.car.domain.CarDealership;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Table(name = "addres")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Addres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city", length = 45, nullable = false)
    private String city;

    @Column(name = "street", length = 45, nullable = false)
    private String street;

    @OneToMany(mappedBy = "addres", fetch = FetchType.LAZY)
    private Collection<CarDealership> carDealership;

    public  Addres(Integer id, String city, String street){
        this.id = id;
        this.city = city;
        this.street = street;
    }
    @Override
    public String toString() {
        return "\n\nAddres: id: " + id + ", city: " + city + ", street: " + street
                + "]";
    }
}
