package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
 * Classe de Conta Especial
 * @author eduardo da silva ferreira - eduardo.s.ferreira@gmail.com
 * @category conta
 * @version 1.0
 */
public class ContaEspecial extends Conta { 

	/** Construtor responsável pela classe
	 * @author eduardo da silva ferreira
	 */
    public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void deposita(double valor) {
        //br.com.bytebank.banco.especial.ContaEspecial.deposita(double)

    }

}
