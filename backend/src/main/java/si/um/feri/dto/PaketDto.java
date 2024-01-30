package si.um.feri.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public record PaketDto(Long id, String naziv, String prenosPodatkov, int hitrostPrenosa, String minute, float cena) {
}
