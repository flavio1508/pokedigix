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
    
   
}
