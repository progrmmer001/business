package com.example.store.model.material;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TradeMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
