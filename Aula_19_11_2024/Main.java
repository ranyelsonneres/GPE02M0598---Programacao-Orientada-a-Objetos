import controller.PessoaController;
import view.PessoaView;

public class Main {
    public static void main(String[] args) {
        PessoaController controller = new PessoaController();
        PessoaView view = new PessoaView(controller);
        view.setVisible(true);
    }
}
