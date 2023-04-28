package br.com.example.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.example.todo.domain.Todo;
import br.com.example.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar1", "Estudar Spring e Angular",
				LocalDateTime.parse("28/04/2023 13:00", formatter), false);
		Todo t2 = new Todo(null, "Estudar2", "Estudar Spring e Angular",
				LocalDateTime.parse("28/04/2023 13:00", formatter), false);
		Todo t3 = new Todo(null, "Estudar3", "Estudar Spring e Angular",
				LocalDateTime.parse("28/04/2023 13:00", formatter), true);
		Todo t4 = new Todo(null, "Estudar4", "Estudar Spring e Angular",
				LocalDateTime.parse("28/04/2023 13:00", formatter), true);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
