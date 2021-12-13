package com.backend.application.domain.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.application.domain.Cliente;
import com.backend.application.domain.repository.ClienteRepository;

@Service
public class ClienteServices {

	@Autowired
	private ClienteRepository clienteRepo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Cliente não Encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));

	}

}
