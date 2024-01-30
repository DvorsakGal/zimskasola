package si.um.feri.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import si.um.feri.dto.PaketDto;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Paket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String naziv;
    private String prenosPodatkov;
    private int hitrostPrenosa;
    private String minute;
    private float cena;
    private LocalDateTime created = LocalDateTime.now();

    public Paket(PaketDto dto) {
        setNaziv(dto.naziv());
        setPrenosPodatkov(dto.prenosPodatkov());
        setHitrostPrenosa(dto.hitrostPrenosa());
        setMinute(dto.minute());
        setCena(dto.cena());
    }

    public void updateFrom(PaketDto dto) {
        setNaziv(dto.naziv());
        setPrenosPodatkov(dto.prenosPodatkov());
        setHitrostPrenosa(dto.hitrostPrenosa());
        setMinute(dto.minute());
        setCena(dto.cena());
    }

    public PaketDto toDto() {
        return new PaketDto(id, naziv, prenosPodatkov, hitrostPrenosa, minute, cena);
    }
}
