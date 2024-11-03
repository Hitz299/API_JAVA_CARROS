package br.com.fiap.exceptions;

public class EntidadeNaoEncontradaException extends Exception {
    public EntidadeNaoEncontradaException() {
    }

    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
}