package bridge.abst;

import java.util.HashMap;
import java.util.Map;

public class Clerigo extends RpgCharacter {
    
    public Clerigo(int vida, int forca, int velocidade, int resistencia, int destreza, int inteligencia) {
        
        super(vida, forca, velocidade, resistencia, destreza, inteligencia);
    }

    public Map<Integer, Integer> calcAtaque(RpgCharacter alvo) {

        Map<Integer, Integer> dados = new HashMap<>();

        Integer danoLimpo = (super.getInteligencia() + super.getDestreza()) / 10;
        Integer danoFinal = danoLimpo - (alvo.getResistencia() / 10);
        Integer vidaRestanteAlvo = alvo.getVida() - danoFinal;
        
        dados.put(0, danoLimpo);
        dados.put(1, danoFinal);
        dados.put(2, vidaRestanteAlvo);

        return dados;
    }


}
