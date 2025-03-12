package bridge.impl;

import java.util.Map;

import bridge.abst.RpgCharacter;

public class EnglishRender implements RpgRender {

    public void renderizarAtaque(RpgCharacter personagem, RpgCharacter alvo){

        Map<Integer, Integer> dados = personagem.calcAtaque(alvo);

        System.out.println( "---------------------------------");
        System.out.println( "Clean damage amount: " + dados.get(0));
        System.out.println( "Damage against target: " + dados.get(1));
        System.out.println( "Target's life: " + dados.get(2));
        System.out.println( "---------------------------------");
    }
}

