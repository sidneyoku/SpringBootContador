package br.sidney.ifpr.paranava.posweb.contador.controle;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contador")
public class ContadorControle {
	
	public int qtdAcessos = 0;
	
	@RequestMapping
	public String contador() {
		qtdAcessos++;
		return "Acessos: " + qtdAcessos;
		
	}

}
