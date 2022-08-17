package br.com.digix.pokedigix.ataque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digix.pokedigix.tipo.TipoResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = {"/api/v1/ataques"}, produces = {"application/json"})

public class AtaqueController {
    @Autowired
    private AtaqueRepository ataqueRepository;
    
    @Operation(summary = "Buscar por ID")
    @ApiResponse(responseCode = "200", description = "Retorna os dados do ataque solicitado")
    @GetMapping(path = "/{id}")
    public ResponseEntity<AtaqueResponseDTO> buscarPorId(@PathVariable Long id) {
        Ataque ataque =  ataqueRepository.findById(id).get();
        TipoResponseDTO tipo = new TipoResponseDTO(ataque.getTipo().getId(), ataque.getTipo().getNome());
        return ResponseEntity.ok( new AtaqueResponseDTO(ataque.getId(),ataque.getNome(), ataque.getDescricao(),ataque.getCategoria(), ataque.getForca(),ataque.getAcuracia(), ataque.getPontosDePoder(), tipo));
            
    }

    @Operation(summary = "Criar um  ataque usando o Tipo")
    @ApiResponse(responseCode = "201", description = "Ataque criado usando o Tipo")
    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<AtaqueResponseDTO> criarAtaque(@RequestBody AtaqueRequestDTO novoAtaque) throws Exception{
        Tipo tipo = ataqueRepository.findById(novoAtaque.getTipoId()).get();
        Ataque ataque = new Ataque(novoAtaque.getNome(), novoAtaque.getForca(), novoAtaque.getAcuracia(), novoAtaque.getPontosDePoder(), novoAtaque.getDescricao(), novoAtaque.getCategoria(), tipo);
        ataqueRepository.save(ataque);

        TipoResponseDTO tipoResponseDTO = new TipoResponseDTO(tipo.getId(), tipo.getNome());
        return ResponseEntity.status(HttpStatus.CREATED).body( new AtaqueResponseDTO(ataque.getId(),ataque.getNome(), ataque.getDescricao(),ataque.getCategoria(), ataque.getForca(),ataque.getAcuracia(), ataque.getPontosDePoder(), tipo));
    }
    
   
}
