package config;

public final class CredentialsConfig {

    private CredentialsConfig() {
    }

    public static String demoQaUsername() {
        return readRequired("demoqa.username", "DEMOQA_USERNAME");
    }

    public static String demoQaPassword() {
        return readRequired("demoqa.password", "DEMOQA_PASSWORD");
    }

    private static String readRequired(String propertyKey, String envKey) {
        String value = System.getProperty(propertyKey);

        if (value == null || value.isBlank()) {
            value = System.getenv(envKey);
        }
        if (value == null || value.isBlank()) {
            throw new IllegalStateException(
                    "Missing credentials: set -D" + propertyKey + "=... or env " + envKey);
        }
        return value;
    }
}
