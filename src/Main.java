
import bridge.abst.Clerigo;
import bridge.abst.Guerreiro;
import bridge.abst.RpgCharacter;
import bridge.impl.EnglishRender;
import bridge.impl.PortugueseRender;
import bridge.impl.RpgRender;

public class Main{
   
    public static void main(String args[]){

        RpgCharacter clerigo;
        RpgCharacter guerreiro;

        RpgRender render;

        clerigo = new Clerigo(100, 40, 40, 30, 60, 80);
        guerreiro = new Guerreiro(100, 90, 50, 70, 60, 10);

        System.out.println("Clerigo ataca guerreiro (RENDERIZADO EM PORTUGUÊS):");
        render = new PortugueseRender();
        clerigo.setRender(render);
        clerigo.renderizarAtaque(guerreiro);

        System.out.println("Guerreiro ataca clerigo (RENDERIZADO EM INGLÊS):");
        render = new EnglishRender();
        guerreiro.setRender(render);
        guerreiro.renderizarAtaque(clerigo);

    }
    



}