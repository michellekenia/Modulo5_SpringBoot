package br.com.zup.ZupCar.Controller;

import br.com.zup.ZupCar.DTOS.CarroDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    private List<CarroDTO> concessionaria = new ArrayList<>();

    @GetMapping
    public List<CarroDTO> exibirCarros() {
        return concessionaria;
    }

    @PostMapping
    public void cadastrarCarro(@RequestBody CarroDTO carroDTO) {
        concessionaria.add(carroDTO);
    }

}
