package io.github.lbraz.mscartoes.application;

import io.github.lbraz.mscartoes.application.representation.CartaoSaveRequest;
import io.github.lbraz.mscartoes.domain.Cartao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("cartoes")
@RequiredArgsConstructor
public class CartoesResource {

    private final CartaoService service;

    @GetMapping
    public String status() {
        return "ok";
    }

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody CartaoSaveRequest request) {
        final Cartao cartao = request.toModel();
        service.save(cartao);
        return ResponseEntity.status(CREATED).build();
    }
}
