package br.sc.senac.servicetecinfo.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.sc.senac.servicetecinfo.model.Cliente;
import br.sc.senac.servicetecinfo.rest.response.ApiResponse;
import br.sc.senac.servicetecinfo.rest.response.ResponseEntityUtil;
import br.sc.senac.servicetecinfo.util.NullValidator;

@RestController
@CrossOrigin
public class ClienteServices {
 
	@Autowired
	NullValidator validator;
	
	@PostMapping(value = "/saveClient", produces = "application/json", consumes = "application/json")
	@ResponseBody
	@CrossOrigin
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<ApiResponse> addClient(@RequestBody Cliente cliente){
		try {
           
            return ResponseEntityUtil.okResponseEntity("Ok, sucesso");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntityUtil.okResponseEntity("Ok, Sucesso");
	}
	
}
