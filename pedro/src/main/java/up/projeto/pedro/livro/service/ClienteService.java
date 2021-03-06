package up.projeto.pedro.livro.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.commom.exception.BusinessException;
import up.projeto.pedro.livro.commom.exception.BusinessExceptionCode;
import up.projeto.pedro.livro.entity.Cliente;
import up.projeto.pedro.livro.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRep;
	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		//Cliente c = clienteRep.findById(cliente.getIdCliente()).get();
		if(cliente.getCpf() != null) {
			BusinessExceptionCode codigoErro = BusinessExceptionCode.ERR001;
			BusinessException b = new BusinessException(codigoErro);
			throw b;
		}
		return clienteRep.save(cliente);
	}
	
	public List<Cliente> listar() {
		return clienteRep.findAll();	
	}
	
	public void excluir(Cliente cliente) {
		clienteRep.delete(cliente);
	}
	
	public Cliente buscarPorId(Integer id) {
		return clienteRep.findById(id).get();
	}
	
	public List<Cliente> buscarPorCpf(String cpf) {
		return clienteRep.findByCpf(cpf);
	}
	
}
