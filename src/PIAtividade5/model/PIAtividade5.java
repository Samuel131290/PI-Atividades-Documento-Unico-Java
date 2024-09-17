package PIAtividade5.model;
import PIAtividade5.telas.TelaInicial;

/**
* Classe sresponsável por iniciar a aplicação.
* Cria uma instância da classe TelaInicial e a torna visível para o usuário.
*/
public class PIAtividade5
{
    /**
    * Método principal que inicia a aplicação.
    * Cria uma instância da classe TelaInicial e a torna visível para o usuário.
    * @param args argumentos de linha de comando (não utilizados neste caso)
    */
    public static void main(String[] args)
    {
        TelaInicial fl = new TelaInicial(); // Cria uma instância da classe TelaInicial
        fl.setVisible(true); // Torna a janela visível para o usuário
    }
}
