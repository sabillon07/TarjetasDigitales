
package com.mibanco.tarjetasdigitales;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mibanco.tarjetasdigitales.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String sayBye(String nombre) {
		return "Adios " + nombre;
	}
    
 
}

