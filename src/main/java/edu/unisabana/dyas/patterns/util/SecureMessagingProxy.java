package edu.unisabana.dyas.patterns.util;

public class SecureMessagingProxy implements MessageSender {
    private final MessagingClient originalClient;

    public SecureMessagingProxy(MessagingClient originalClient) {
        this.originalClient = originalClient;
    }

    @Override
    public void sendMessage(String message) {
        if (message.contains("##{./exec(")) {
            System.out.println("[LOG] Mensaje bloqueado debido a contenido peligroso");
        } else {
            originalClient.sendMessage(message);
        }
    }
}
