package com.backend.application.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.application.domain.Pedido;
import com.backend.application.domain.services.PedidoService;


@RestController
@RequestMapping(value = "/pedido")
public class PedidoResources {

	@Autowired
	private PedidoService services;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Pedido>> listar(@PathVariable Integer id) {

		Optional<Pedido> obj = Optional.ofNullable(services.find(id));
		return ResponseEntity.ok().body(obj);
	}

}
