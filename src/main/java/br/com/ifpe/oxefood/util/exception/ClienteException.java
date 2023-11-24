package br.com.ifpe.oxefood.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class ClienteException extends RuntimeException {
    public static final String MSG_CLIENTE_SEM_NOME = "Cliente deve possuir um nome.";
    public ClienteException(String msg) {

        super(String.format(msg));
    }
}
