package bridge.impl;

import java.util.Map;

import bridge.abst.RpgCharacter;

public class PortugueseRender implements RpgRender {

    public void renderizarAtaque(RpgCharacter personagem, RpgCharacter alvo){

        Map<Integer, Integer> dados = personagem.calcAtaque(alvo);

        System.out.println( "---------------------------------");
        System.out.println( "Dano do ataque limpo: " + dados.get(0));
        System.out.println( "Dano causado ao alvo: " + dados.get(1));
        System.out.println( "Vida restante do alvo: " + dados.get(2));
        System.out.println( "---------------------------------");
    }

}
