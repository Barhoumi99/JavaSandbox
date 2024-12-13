package arrow_functions;

public enum ANSI {
    RESET("\u001B[0m"),
    BOLD("\u001B[1m"),
    UNDERLINED("\u001B[4m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    BLACK_BG("\u001B[40m"),
    RED_BG("\u001B[41m"),
    GREEN_BG("\u001B[42m"),
    YELLOW_BG("\u001B[43m"),
    BLUE_BG("\u001B[44m"),
    PURPLE_BG("\u001B[45m"),
    CYAN_BG("\u001B[46m"),
    WHITE_BG("\u001B[47m");



    private final String code;

    ANSI(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
