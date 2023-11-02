package com.gymproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static junit.framework.Assert.assertTrue;
//import static junit.framework.Assert.assertFalse;

//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

public class TabelaAlunos {
	private static final LinkedList<Aluno> table = new LinkedList<>();;
	private static int numAlunos=0;
	private static ObservableList<Aluno> data;

	public static ObservableList<Aluno> getData() {
		return data;
	}

	public static void setData(ObservableList<Aluno> data) {
		TabelaAlunos.data = data;
	}

	/*public TabelaAlunos() {
		assertTrue(table.isEmpty());
	}*/

	public static void addElement(Aluno a) {
		assertTrue(table.add(a));
		assertTrue(table.contains(a));
		numAlunos++;
	}
	
	public static boolean searchElement(Aluno a) {
        return table.contains(a);
    }
	
	public static void removeElement(Aluno a) {
		assertTrue(table.remove(a));
		assertFalse(table.contains(a));
		numAlunos--;
	}
	
	public static ObservableList<Aluno> getTable() {
		return data;
	}



	public static void setObservable () {
		data = FXCollections.observableList(table);
	}

}