package com.craftmend.openaudiomc.generic.core.logging;

public class OpenAudioLogger {

    private static final String LOG_PREFIX = "[OpenAudioMc] ";

    public static void toConsole(String message) {
        System.out.println(LOG_PREFIX + message);
    }

}
