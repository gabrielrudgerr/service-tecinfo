package br.sc.senac.servicetecinfo.util;

import org.springframework.stereotype.Component;

@Component
public class NullValidator {
	
	public boolean  isNull(Object obj) {
		return obj == null;
	}
	
	public boolean  isNotNull(Object obj) {
		return obj != null;
	}

}










