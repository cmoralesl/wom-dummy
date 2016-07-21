package cl.wom.transformacion.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.wom.transformacion.json.datoscliente.Customer;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@RestController
public class DatosClienteController {

	@RequestMapping("/datosCliente")
	public Customer obtenerDatosCliete(@RequestParam(value = "name", defaultValue = "World") String name) {
		Customer respuesta = null;
		PodamFactory podam = new PodamFactoryImpl();
		try {
			respuesta = podam.manufacturePojo(Customer.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
}