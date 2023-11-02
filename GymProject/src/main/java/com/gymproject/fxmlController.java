package com.gymproject;

import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

import java.text.SimpleDateFormat;

public class fxmlController {
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
    @FXML
    private TextField nome;
    @FXML
    private TextField cpf;
    @FXML
    private TextField tel;
    @FXML
    private TextField mail;
    @FXML
    private TextField defS;
    @FXML
    private TextField forma;
    @FXML
    private TextField obj;
    @FXML
    private DatePicker date;
    @FXML
    private DatePicker dataNasc;
    @FXML
    private DatePicker dataPag;
    @FXML
    private MenuItem plano1;
    @FXML
    private MenuItem plano2;

    private String planoEsc;
    private LocalDate dataCad;
    private LocalDate nasc;
    private LocalDate pag;

    @FXML
    private RadioButton student;

    @FXML
    private RadioButton def;

    @FXML
    private RadioButton pago;

    @FXML
    private Button submitButton;
    @FXML
    private ToggleGroup p, d, st;
    @FXML
    private TableView<Aluno> table;
    @FXML
    private TableColumn<Aluno, Integer> id;
    @FXML
    private TableColumn<Aluno, String> nameC;
    @FXML
    private TableColumn<Aluno, String> telC;
    @FXML
    private TableColumn<Aluno, String> mailC;
    @FXML
    private TableColumn<Aluno, String> cpfC;
    @FXML
    private TableColumn<Aluno, LocalDate> nascC;
    @FXML
    private TableColumn<Aluno, String> pagC;
    @FXML
    private TableColumn<Aluno, LocalDate> dataPC;
    @FXML
    private TableColumn<Aluno, String> planoC;
    @FXML
    private TableColumn<Aluno, String> pagoC;
    @FXML
    private TableColumn<Aluno, String> rest;
    @FXML
    private TableColumn<Aluno, String> stC;
    @FXML
    private TableColumn<Aluno, LocalDate> cadC;
    @FXML
    private TableColumn<Aluno, String> objC;
    public GridPane myGridPane;

    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    private void switchToScene2 (ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainScene.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Menu Principal");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToScene1 (ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GymApp.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToScene3 (ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gerenciamentoAluno.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Gerenciamento de Alunos");
        stage.setScene(scene);
        stage.show();
    }


    //public void getDate (ActionEvent event) throws IOException {
      //  System.out.println(date.getValue());

    //}

    /*public void cpfInput (KeyEvent event) {
        InputMasks.CPFmask(cpf);
    }

    public void telInput (KeyEvent event) {
        InputMasks.TelMask(tel);
    }

    public void emailInput (KeyEvent event) {
        InputMasks.EmailMask(mail);
    }

    public void DataInput (KeyEvent event) {
        InputMasks.DateMask(date);
    }*/

    /*private void NameFormatter() {
        String regex = "[^a-zA-Z\\u00C0-\\u00FF ]";
        nome.setText(new PalavrasMaiusculas);
    }*/

    @FXML
    private void TelFormat() {
        InputMasks tff = new InputMasks();
        tff.setMask("(##) #####-####");
        tff.setCharValid("0123456789");
        tff.setTf(tel);
        tff.format();
    }

    @FXML
    private void CPFFormat() {
        InputMasks tff = new InputMasks();
        tff.setMask("###.###.###-##");
        tff.setCharValid("0123456789");
        tff.setTf(cpf);
        tff.format();
    }


    @FXML
    private void cadastrarAluno (ActionEvent event) throws IOException {
        //MenuItem item = plano.getSelectionModel().getSelectedItem();
        System.out.println(nome.getText());
        System.out.println(cpf.getText());
        System.out.println(tel.getText());
        System.out.println(mail.getText());
        System.out.println(defS.getText());
        System.out.println(forma.getText());
        System.out.println(obj.getText());
        dataCad = date.getValue();
        nasc = dataNasc.getValue();
        pag = dataPag.getValue();
        System.out.println(dataCad);
        System.out.println(nasc);
        System.out.println(pag);
        System.out.println(student.isSelected());
        System.out.println(def.isSelected());
        System.out.println(defS.getText());
        System.out.println(planoEsc);
        //plano.get
        Aluno a = new Aluno(new SimpleStringProperty(nome.getText()), new SimpleStringProperty(mail.getText()), new SimpleIntegerProperty(0) , new SimpleStringProperty(tel.getText()),
                new SimpleStringProperty(cpf.getText()), new SimpleStringProperty(forma.getText()), new SimpleBooleanProperty(pago.isSelected()), new SimpleStringProperty(defS.getText()),
                new SimpleStringProperty(planoEsc), new SimpleBooleanProperty(student.isSelected()), new SimpleObjectProperty<LocalDate>(dataCad) , new SimpleObjectProperty<LocalDate>(nasc), new SimpleObjectProperty<LocalDate>(pag), new SimpleStringProperty(obj.getText()));
        clearAll(event);
        TabelaAlunos.addElement(a);
        TabelaAlunos.setObservable();
        id.setCellValueFactory(new PropertyValueFactory<Aluno, Integer>("id"));
        nameC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome"));
        telC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("telefone"));
        mailC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("email"));
        cpfC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("CPF"));
        nascC.setCellValueFactory(new PropertyValueFactory<Aluno, LocalDate>("dataNasc"));
        pagC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("FormaPag"));
        dataPC.setCellValueFactory(new PropertyValueFactory<Aluno, LocalDate>("dataPag"));
        pagoC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("pago"));
        planoC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("plano"));
        rest.setCellValueFactory(new PropertyValueFactory<Aluno, String>("defFisica"));
        stC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("estudante"));
        cadC.setCellValueFactory(new PropertyValueFactory<Aluno, LocalDate>("dataCad"));
        objC.setCellValueFactory(new PropertyValueFactory<Aluno, String>("objetivo"));
        table.setItems(TabelaAlunos.getData());
    }

    @FXML
    private void handleMenuOption1 (ActionEvent event) throws IOException {
        planoEsc = plano1.getText();
    }

    @FXML
    private void handleMenuOption2 (ActionEvent event) throws IOException {
        planoEsc = plano2.getText();
    }

    @FXML
    private void clearAll (ActionEvent event) throws IOException {
        nome.clear();
        cpf.clear();
        tel.clear();
        mail.clear();
        defS.clear();
        forma.clear();
        obj.clear();
        date.setValue(LocalDate.now());
        dataNasc.setValue(LocalDate.now());
        dataPag.setValue(LocalDate.now());
        p.getToggles().clear();
        d.getToggles().clear();
        st.getToggles().clear();
    }

}
