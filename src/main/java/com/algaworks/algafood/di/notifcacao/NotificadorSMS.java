package com.algaworks.algafood.di.notifcacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando o %s por SMS através do telefone %s: %s\n", cliente.getNome(), 
				cliente.getTelefone(), mensagem);
	}

	
}
