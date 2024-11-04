package br.com.fiap.main;

import br.com.fiap.resource.CarroResource;
import br.com.fiap.resource.CorsFilter;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {
    public static final String BASE_URI = "http://localhost:8080/";

    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig()
                .register(CarroResource.class)
                .register(CorsFilter.class);

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) {
        HttpServer server = startServer();
        System.out.println(String.format("Jersey app started at %s%nPress Ctrl-C to stop it...", BASE_URI));

        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Encerrando o servidor...");
            server.shutdownNow();
            System.out.println("Servidor encerrado com sucesso.");
        }));

        try {
            System.in.read();
        } catch (IOException e) {
            System.err.println("Erro ao iniciar o servidor: " + e.getMessage());
        } finally {
            server.shutdownNow();
        }
    }
}
