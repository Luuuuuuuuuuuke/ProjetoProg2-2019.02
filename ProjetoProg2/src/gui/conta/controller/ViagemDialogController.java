package gui.conta.controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sistema.negocio.ControladorPassageiro;

public class ViagemDialogController {
    @FXML
    private DatePicker tfData;
    @FXML
    private TextField tfOrigem;
    @FXML
    private TextField tfNome;
    private ControladorPassageiro cp = ControladorPassageiro.getInstance();
    private Stage dialogStage;
    private boolean okClicked =  false;
}
