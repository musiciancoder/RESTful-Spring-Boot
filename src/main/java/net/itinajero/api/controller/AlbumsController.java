package net.itinajero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.itinajero.api.entity.Album;
import net.itinajero.api.service.IAlbumsService;

@RestController //porque estamos desarrollando una restfull api
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumsService serviceAlbums;
	
	//metodo para obtener el listado de albums
	@GetMapping("/albums") //nuestro endpoint sera entonces api/albums. Notar que al escribir en un navegador http://localhost:8080/api/albums ya se nos entregan los registros que tenemos almacenado previamente  en la
	//(cont) tabla "albums" en mysql, y los entregará siempre en formato JSON, porque estamos trabajando con @RestController, sin importar que nosotros no tengamos ningun JSP para renderizar; tampoco importa el tipo que retornara el metodo, siempre sera un JSON;
	public List<Album> buscarTodos(){ 
		return serviceAlbums.buscarTodos(); //ya que estamos ocupando @RestController, el tipo de datos a retornar los va a pasar a tipo JSON
		
	}

}
