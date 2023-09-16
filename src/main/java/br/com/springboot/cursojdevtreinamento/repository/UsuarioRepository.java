package br.com.springboot.cursojdevtreinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.cursojdevtreinamento.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    @Query(value= "select u from Usuario u where upper(trim(u.nome)) like %?1%")
    List<Usuario> buscarPorNome(String nome);
}
