package br.emprestimo.modelo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {
	List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public boolean adiciona(Emprestimo emprestimo) {
		return emprestimos.add(emprestimo);
	}

	public Emprestimo consulta(Emprestimo umEmprestimo) {
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimos.contains(umEmprestimo)) {
				return emprestimo;
			}
		}
		return null;
	}
}
