package bridge.abst;

import java.util.Map;
import bridge.impl.RpgRender;

public abstract class RpgCharacter {
   
    private RpgRender render;

    private int vida;
    private int forca;
    private int velocidade;
    private int resistencia;
    private int destreza;
    private int inteligencia;

    protected RpgCharacter (int vida, int forca, int velocidade, int resistencia, int destreza, int inteligencia) {
        this.vida = vida;
        this.forca = forca;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
    }

    public void setRender(RpgRender render) {
        this.render = render;
    }

    // Map chaves -> 0 = danoLimpo | 1 = danoFinal | 2 = vidaRestanteInimigo
    public abstract Map<Integer, Integer> calcAtaque(RpgCharacter alvo);

    public void renderizarAtaque(RpgCharacter alvo){

        if(render != null){
            render.renderizarAtaque(this, alvo);
        }
        else {
            System.out.println("Selecione um render para o personagem realizar seu ataque.");
        }        

    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }
    
}
