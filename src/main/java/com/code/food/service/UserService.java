package com.code.food.service;

import com.code.food.entity.UserEntity;
import com.code.food.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// A anotação @Service é usada para marcar uma classe como um serviço no Spring.
// Essa classe geralmente contém a lógica de negócio da aplicação.
@Service
public class UserService {

    // A anotação @Autowired é utilizada para injeção automática de dependências pelo Spring.
    // A variável userRepository é uma instância do repositório UserRepository, que é
    // responsável pela interação com a base de dados para realizar operações CRUD
    // (Create, Read, Update, Delete) relacionadas ao recurso "User".
    // A visibilidade "private" indica que ela só pode ser acessada dentro da classe onde foi declarada.
    @Autowired
    private UserRepository userRepository;

    // O metodo createUser recebe um objeto userEntity, que representa um usuário,
    // e o salva no banco de dados utilizando o repositório userRepository.
    // O metodo retorna o objeto userEntity após ser salvo, com os dados atualizados,
    // incluindo o ID gerado automaticamente, se aplicável.
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    // O metodo findAllUsers() irá retornar uma lista(List) contendo todos os usuários que foram cadastrados
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }
}
