package br.edu.ifce.lp2.repository;

import br.edu.ifce.lp2.core.domain.Client;
import br.edu.ifce.lp2.core.ports.driven.repository.ClientRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String>, ClientRepositoryPort {
}
