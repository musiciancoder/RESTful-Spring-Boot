package net.itinajero.api.service;

import java.util.List;

import net.itinajero.api.entity.Album;

public interface IAlbumsService {
	
	List <Album> buscarTodos();  //busca en la bbdd todos los registros de la tabla de albums

}
