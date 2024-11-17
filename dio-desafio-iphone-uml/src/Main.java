
import smartphone.apple.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // métodos comuns a todos smartphones
        iphone.ligar("99976-1234");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://web.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.selecionarMusica("Sertanejo Raiz");
        iphone.tocar();
        iphone.pausar();

        // métodos exclusivos do iPhone
        iphone.ligarFaceTime("Tio e Pardinho");
        iphone.atenderFaceTime();
    }
}