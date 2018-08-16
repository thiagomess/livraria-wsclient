package br.com.correios.bsb.sigep.master.bean.cliente;

import java.rmi.RemoteException;

public class TesteCorreios {
	
	public static void main(String[] args) throws SQLException, SigepClienteException, RemoteException {
		
		AtendeCliente cep = new AtendeClienteProxy();
		
		
		EnderecoERP consultaCEP = cep.consultaCEP("08577-520");
		
		System.out.println(consultaCEP.getEnd());
		System.out.println(consultaCEP.getBairro());
		System.out.println(consultaCEP.getCidade() + " - " + consultaCEP.getUf());
	}

}
