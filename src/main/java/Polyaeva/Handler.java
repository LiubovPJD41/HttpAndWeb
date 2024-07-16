package Polyaeva;

import java.io.BufferedOutputStream;
import java.io.IOException;

@FunctionalInterface
public interface Handler {
    void handle(Request request, BufferedOutputStream response) throws IOException;
}