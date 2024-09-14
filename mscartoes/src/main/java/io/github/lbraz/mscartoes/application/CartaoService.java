package io.github.lbraz.mscartoes.application;

import java.util.List;
import io.github.lbraz.mscartoes.domain.Cartao;
import io.github.lbraz.mscartoes.infra.repository.CartaoRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRespository respository;

    @Transactional
    public Cartao save(Cartao cartao){
        return respository.save(cartao);
    }

    public List<Cartao> getCartoesRendaMenorIgual(Long renda){
        var rendaBigDecimal = BigDecimal.valueOf(renda);
        return respository.findByRendaLessThanEqual(rendaBigDecimal);
    }
}
