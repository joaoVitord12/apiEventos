package com.eventos.resources;

import com.eventos.dtos.UsuarioDTO;
import com.eventos.repositories.UsuarioRepository;
import com.eventos.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;


    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscarUsuarioPorId(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorId(id));
    }


    @PostMapping()
    public ResponseEntity<UsuarioDTO> cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(usuarioService.cadastrarUsuario(usuarioDTO));
    }

    @DeleteMapping()
    public ResponseEntity<Void> deletarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.deletarUsuario(usuarioDTO.getId());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
