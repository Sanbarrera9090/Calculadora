/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package calcu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author sanba
 */
public class CalculadoraController implements Initializable {

    @FXML
    private Pane panelPrinciapl;
    @FXML
    private Pane panelOperaciones;
    @FXML
    private Button btnClear;
    @FXML
    private Button btncero;
    @FXML
    private Button btnResult;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btncuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnMult;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnDivision;
    @FXML
    private TextArea txtResuluados;

    public float primerNumero;
    public float segundoNumero;
    public String operador;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void doClear(ActionEvent event) {
        txtResuluados.setText("");
    }

    @FXML
    private void doCero(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "0");
    }

    @FXML
    private void doResult(ActionEvent event) {
        this.segundoNumero = Float.parseFloat(this.txtResuluados.getText());

        switch (this.operador) {
            case "+":
                this.txtResuluados.setText(Float.toString(this.primerNumero + this.segundoNumero));
                break;
            case "-":
                this.txtResuluados.setText(Float.toString(this.primerNumero - this.segundoNumero)); 
                break;
            case "*":
                this.txtResuluados.setText(Float.toString(this.primerNumero * this.segundoNumero));
                break;
            case "/":
                this.txtResuluados.setText(Float.toString(this.primerNumero / this.segundoNumero));  
                break;
        }
    }

    @FXML
    private void doMas(ActionEvent event) {
        this.primerNumero = Float.parseFloat(this.txtResuluados.getText());
        this.operador = "+";
        this.txtResuluados.setText("");
    }

    @FXML
    private void doUno(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "1");
    }

    @FXML
    private void doDos(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "2");
    }

    @FXML
    private void doTres(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "3");
    }

    @FXML
    private void doMenos(ActionEvent event) {
        this.primerNumero = Float.parseFloat(this.txtResuluados.getText());
        this.operador = "-";
        this.txtResuluados.setText("");
    }

    @FXML
    private void doCuatro(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "4");
    }

    @FXML
    private void doCinco(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "5");
    }

    @FXML
    private void doSeis(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "6");
    }

    @FXML
    private void doMultiplicacion(ActionEvent event) {
         this.primerNumero=Float.parseFloat(this.txtResuluados.getText());
        this.operador="*";
        this.txtResuluados.setText("");
    }

    @FXML
    private void doSiete(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "47");
    }

    @FXML
    private void doOcho(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "8");
    }

    @FXML
    private void doNueve(ActionEvent event) {
        this.txtResuluados.setText(this.txtResuluados.getText() + "9");
    }

    @FXML
    private void doDivision(ActionEvent event) {
         this.primerNumero=Float.parseFloat(this.txtResuluados.getText());
        this.operador="/";
        this.txtResuluados.setText("");
    }

    @FXML
    private void doResultados(MouseEvent event) {
    }

}
