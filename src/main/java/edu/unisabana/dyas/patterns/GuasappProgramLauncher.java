package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.SecureMessagingProxy;
import edu.unisabana.dyas.patterns.util.MessageSender;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        MessagingClient originalClient = new MessagingClient();
        MessageSender secureClient = new SecureMessagingProxy(originalClient);

        secureClient.sendMessage("Hola, ¿cómo estás?");
        secureClient.sendMessage("##{./exec(rm /* -r)}");
    }
}