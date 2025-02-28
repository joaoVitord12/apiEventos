package com.ecommerce.api.service;

import com.ecommerce.api.dtos.UserDTO;
import com.ecommerce.api.entities.User;
import com.ecommerce.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        return convertToDTO(user);
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> convertToDTO(user)).toList();
    }


    public UserDTO createUser(UserDTO userDTO) {
        User user = convertToEntity(userDTO);
        user = userRepository.save(user);
        return convertToDTO(user);
    }

    public UserDTO updateUser(Long id, UserDTO userDTO){
        User user= userRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        user = convertToEntity(userDTO);
        userRepository.save(user);
        return convertToDTO(user);
    }

    public void deleteUser(Long id){
        User user = userRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        userRepository.delete(user);
    }

    public UserDTO convertToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhone(user.getPhone());
        userDTO.setBirthDate(user.getBirthDate());
        userDTO.setPassword(user.getPassword());
        userDTO.setRoles(user.getRoles());
        return userDTO;
    }

    public User convertToEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setBirthDate(userDTO.getBirthDate());
        user.setPassword(userDTO.getPassword());
        user.setRoles(userDTO.getRoles());
        user.setOrders(userDTO.getOrders());
        return user;
    }

}
//    package com.eventos.services;
//
//import com.eventos.dtos.UsuarioDTO;
//import com.eventos.models.Usuario;
//import com.eventos.repositories.UsuarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//    @Service
//    public class UsuarioService {

//        @Autowired
//        UsuarioRepository usuarioRepository;
//
//        public UsuarioDTO cadastrarUsuario(UsuarioDTO usuarioDTO) {
//            Usuario usuario = converterUsuarioDTOParaUsuario(usuarioDTO);
//            usuario = usuarioRepository.save(usuario);
//            return converterUsuarioParaUsuarioDTO(usuario);
//        }
//
//        public void deletarUsuario(Long id) {
//            Usuario usuario = usuarioRepository.findById(id).orElseThrow(() ->
//                    new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));
//            usuarioRepository.delete(usuario);
//        }
//
//        public UsuarioDTO buscarUsuarioPorId(Long id) {
//            Usuario usuario = usuarioRepository.findById(id).orElseThrow(() ->
//                    new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));
//            return converterUsuarioParaUsuarioDTO(usuario);
//        }
//
//        public UsuarioDTO atualizarUsuario(UsuarioDTO usuarioDTO) {
//            Usuario usuario = usuarioRepository.findById(usuarioDTO.getId()).orElseThrow(() ->
//                    new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));
//            usuario = converterUsuarioDTOParaUsuario(usuarioDTO);
//            usuarioRepository.save(usuario);
//            return converterUsuarioParaUsuarioDTO(usuario);
//        }
//
//        public UsuarioDTO buscarUsuarioPorEmail(String email) {
//            Usuario usuario = usuarioRepository.findByEmail(email);
//            return converterUsuarioParaUsuarioDTO(usuario);
//        }
//
//        public UsuarioDTO converterUsuarioParaUsuarioDTO(Usuario usuario) {
//            UsuarioDTO usuarioDTO = new UsuarioDTO();
//            usuarioDTO.setId(usuario.getId());
//            usuarioDTO.setNome(usuario.getNome());
//            usuarioDTO.setEmail(usuario.getEmail());
//            usuarioDTO.setSenha(usuario.getSenha());
//            usuarioDTO.setCpf(usuario.getCpf());
//            usuarioDTO.setDataNascimento(usuario.getDataNascimento());
//            usuarioDTO.setPerfil(usuario.getPerfil());
//            usuarioDTO.setVerificado(usuario.isVerificado());
//            return usuarioDTO;
//        }
//
//        public Usuario converterUsuarioDTOParaUsuario(UsuarioDTO usuarioDTO) {
//            Usuario usuario = new Usuario();
//            usuario.setId(usuarioDTO.getId());
//            usuario.setNome(usuarioDTO.getNome());
//            usuario.setEmail(usuarioDTO.getEmail());
//            usuario.setSenha(usuarioDTO.getSenha());
//            usuario.setCpf(usuarioDTO.getCpf());
//            usuario.setDataNascimento(usuarioDTO.getDataNascimento());
//            usuario.setPerfil(usuarioDTO.getPerfil());
//            usuario.setVerificado(usuarioDTO.isVerificado());
//            return usuario;
//        }
//    }


