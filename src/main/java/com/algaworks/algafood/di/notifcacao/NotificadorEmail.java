package com.algaworks.algafood.di.notifcacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Noficando %s através do e-mail %s: %s\n", cliente.getNome(), 
				cliente.getEmail(), mensagem);
	}
	
}
