package cl.wom.transformacion.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.wom.transformacion.json.customercontact.CustomerContactResponse;
import cl.wom.transformacion.json.customercontact.GetCustomerContactResponse;
import cl.wom.transformacion.json.customercontact.Return;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@RestController
public class CustomerContactController {

	@RequestMapping("/PSCustomerContactService")
	public CustomerContactResponse pSCustomerContactService(@RequestParam(value = "name", defaultValue = "World") String name) {
		CustomerContactResponse respuesta = new CustomerContactResponse();
		GetCustomerContactResponse nodo1 = new GetCustomerContactResponse();
		Return nodo2 = null;
		PodamFactory podam = new PodamFactoryImpl();
		try {
			nodo2 = podam.manufacturePojo(Return.class);
			nodo1.setReturn(nodo2);
			respuesta.setGetCustomerContactResponse(nodo1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
}