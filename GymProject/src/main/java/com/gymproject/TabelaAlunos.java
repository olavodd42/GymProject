package com.gymproject;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;
//import static org.junit.Assert;

public class TabelaAlunos {
	LinkedHashSet<Aluno> table;
	public int numAlunos;

	public TabelaAlunos() {
		this.table = new LinkedHashSet<Aluno>();
		assertTrue(table.isEmpty());
		numAlunos = 0;
	}

	public void addElement(Aluno a) {
		assertTrue(table.add(a));
		assertFalse(table.add(a));
		assertTrue(table.contains(a));
		numAlunos++;
	}
	
	public boolean searchElement(Aluno a) {
        return table.contains(a);
    }
	
	public void removeElement(Aluno a) {
		assertTrue(table.remove(a));
		assertFalse(table.contains(a));
		numAlunos--;
	}
	
	public void printList() {
		Iterator<Aluno> itr = table.iterator();
		System.out.println("Tabela de Alunos\n");
		while (itr.hasNext()) {
			System.out.println(itr.next() + "\n");
		}
	}
}