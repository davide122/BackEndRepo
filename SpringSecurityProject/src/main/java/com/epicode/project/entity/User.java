package com.epicode.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

import javax.management.relation.Role;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "dipendenti", uniqueConstraints = { @UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email") })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    
    
    // Il caricamento EAGER delle raccolte significa che vengono recuperate 
    // completamente nel momento in cui viene recuperato il loro genitore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "dipendenti_dispositivi",
            joinColumns = @JoinColumn(name = "dipendente_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "dispositivo_id", referencedColumnName = "id")
    )
    private Set<Disponibile> roles = new HashSet<>();
}
