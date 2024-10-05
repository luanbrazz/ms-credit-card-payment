package io.github.lbraz.mscartoes.application;

import io.github.lbraz.mscartoes.domain.ClienteCartao;
import io.github.lbraz.mscartoes.infra.repository.ClienteCartaoRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRespository respository;

    public List<ClienteCartao> listarCartoesByCpf(String cpf){
        return respository.findByCpf(cpf);
    }
}
