package com.gymproject;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GymApp extends Application {


	public static void main(String args[]) {
		/*Aluno a1 = new Aluno("Joao", "joao@mail.com", 1, "(55) 999999999", 00000000000, "Pix", true, "Mensal", false);
		System.out.println(a1.nome);
		System.out.println(a1.email);
		System.out.println(a1.id);
		System.out.println(a1.telefone);
		System.out.println(a1.CPF);
		System.out.println(a1.FormaPag);
		System.out.println(a1.plano);
		System.out.println(a1.estudante);*/
		
		/*TabelaAlunos t1 = new TabelaAlunos();
		Aluno a1 = new Aluno("Joao", "joao@mail.com", 1, "(55) 999999999", 0, "Pix", true, "Mensal", false, 10252023, 11111111, 00000000, "Hipertrofia");
		Aluno a2 = new Aluno("Maria", "maria@mail.com", 2, "(55) 999999999", 00000000030, "Pix", true, "Anual", false, 10252023, 11111111, 00000000, "Emagrecimento");
		Aluno a3 = new Aluno("Carlos", "carlos@mail.com", 3, "(55) 999999000", 01400200030, "Cartao", true, "Perna imóvel", "", true, 10252023, 11111111, 10000000, "Hipertrofia");

		t1.addElement(a1);
		t1.addElement(a2);
		
		t1.printList();
		System.out.println(t1.numAlunos);*/
		launch(args);
 
		//System.out.println(t1.searchElement(a1));
		//System.out.println(t1.searchElement(a3));
		//t1.addElement(a3);
		//System.out.println(t1.table);
		
		//t1.removeElement(a3);
		//System.out.println(t1.table);
	}

	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GymApp.fxml")));
		Scene scene = new Scene(root, 300, 275);
		stage.setTitle("Login");
		stage.setScene(scene);
		stage.show();
	}


}