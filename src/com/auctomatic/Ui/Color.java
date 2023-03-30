package com.auctomatic.Ui;

public enum Color {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, background color etc.
    BLACK("\033[0;30m"),    // BLACK
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    BLUE("\033[0;34m"),     // BLUE
    MAGENTA("\033[0;35m"),  // MAGENTA
    CYAN("\033[0;36m"),     // CYAN
    WHITE("\033[0;37m"),    // WHITE

    // Bold
    BLACK_BOLD("\033[1;30m"),   // BLACK
    RED_BOLD("\033[1;31m"),     // RED
    GREEN_BOLD("\033[1;32m"),   // GREEN
    YELLOW_BOLD("\033[1;33m"),  // YELLOW
    BLUE_BOLD("\033[1;34m"),    // BLUE
    MAGENTA_BOLD("\033[1;35m"), // MAGENTA
    CYAN_BOLD("\033[1;36m"),    // CYAN
    WHITE_BOLD("\033[1;37m"),   // WHITE

    // Underline
    BLACK_UNDERLINED("\033[4;30m"),     // BLACK
    RED_UNDERLINED("\033[4;31m"),       // RED
    GREEN_UNDERLINED("\033[4;32m"),     // GREEN
    YELLOW_UNDERLINED("\033[4;33m"),    // YELLOW
    BLUE_UNDERLINED("\033[4;34m"),      // BLUE
    MAGENTA_UNDERLINED("\033[4;35m"),   // MAGENTA
    CYAN_UNDERLINED("\033[4;36m"),      // CYAN
    WHITE_UNDERLINED("\033[4;37m"),     // WHITE

    // Background
    BLACK_BACKGROUND("\033[40m"),   // BLACK
    RED_BACKGROUND("\033[41m"),     // RED
    GREEN_BACKGROUND("\033[42m"),   // GREEN
    YELLOW_BACKGROUND("\033[43m"),  // YELLOW
    BLUE_BACKGROUND("\033[44m"),    // BLUE
    MAGENTA_BACKGROUND("\033[45m"), // MAGENTA
    CYAN_BACKGROUND("\033[46m"),    // CYAN
    WHITE_BACKGROUND("\033[47m"),   // WHITE

    // High Intensity
    BLACK_BRIGHT("\033[0;90m"),     // BLACK
    RED_BRIGHT("\033[0;91m"),       // RED
    GREEN_BRIGHT("\033[0;92m"),     // GREEN
    YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
    BLUE_BRIGHT("\033[0;94m"),      // BLUE
    MAGENTA_BRIGHT("\033[0;95m"),   // MAGENTA
    CYAN_BRIGHT("\033[0;96m"),      // CYAN
    WHITE_BRIGHT("\033[0;97m"),     // WHITE

    // Bold High Intensity
    BLACK_BOLD_BRIGHT("\033[1;90m"),    // BLACK
    RED_BOLD_BRIGHT("\033[1;91m"),      // RED
    GREEN_BOLD_BRIGHT("\033[1;92m"),    // GREEN
    YELLOW_BOLD_BRIGHT("\033[1;93m"),   // YELLOW
    BLUE_BOLD_BRIGHT("\033[1;94m"),     // BLUE
    MAGENTA_BOLD_BRIGHT("\033[1;95m"),  // MAGENTA
    CYAN_BOLD_BRIGHT("\033[1;96m"),     // CYAN
    WHITE_BOLD_BRIGHT("\033[1;97m"),    // WHITE

    // High Intensity backgrounds
    BLACK_BACKGROUND_BRIGHT("\033[0;100m"),     // BLACK
    RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW
    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),      // BLUE
    MAGENTA_BACKGROUND_BRIGHT("\033[0;105m"),   // MAGENTA
    CYAN_BACKGROUND_BRIGHT("\033[0;106m"),      // CYAN
    WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
    
    public static void main(String[] args) {
        System.out.println(Color.BLACK + "Black");
        System.out.println(Color.RED + "Red");
        System.out.println(Color.GREEN + "Green");
        System.out.println(Color.YELLOW + "Yellow");
        System.out.println(Color.BLUE + "Blue");
        System.out.println(Color.MAGENTA + "Magenta");
        System.out.println(Color.CYAN + "Cyan");
        System.out.println(Color.WHITE + "White");
        
        System.out.println(Color.BLACK_BOLD + "Black Bold");
        System.out.println(Color.RED_BOLD + "Red Bold");
        System.out.println(Color.GREEN_BOLD + "Green Bold");
        System.out.println(Color.YELLOW_BOLD + "Yellow Bold");
        System.out.println(Color.BLUE_BOLD + "Blue Bold");
        System.out.println(Color.MAGENTA_BOLD + "Magenta Bold");
        System.out.println(Color.CYAN_BOLD + "Cyan Bold");
        System.out.println(Color.WHITE_BOLD + "White Bold");
        
        System.out.println(Color.BLACK_UNDERLINED + "Black Underlined");
        System.out.println(Color.RED_UNDERLINED + "Red Underlined");
        System.out.println(Color.GREEN_UNDERLINED + "Green Underlined");
        System.out.println(Color.YELLOW_UNDERLINED + "Yellow Underlined");
        System.out.println(Color.BLUE_UNDERLINED + "Blue Underlined");
        System.out.println(Color.MAGENTA_UNDERLINED + "Magenta Underlined");
        System.out.println(Color.CYAN_UNDERLINED + "Cyan Underlined");
        System.out.println(Color.WHITE_UNDERLINED + "White Underlined");
        
        System.out.println(Color.BLACK_BACKGROUND + "Black Background");
        System.out.println(Color.RED_BACKGROUND + "Red Background");
        System.out.println(Color.GREEN_BACKGROUND + "Green Background");
        System.out.println(Color.YELLOW_BACKGROUND + "Yellow Background");
        System.out.println(Color.BLUE_BACKGROUND + "Blue Background");
        System.out.println(Color.MAGENTA_BACKGROUND + "Magenta Background");
        System.out.println(Color.CYAN_BACKGROUND + "Cyan Background");
        System.out.println(Color.WHITE_BACKGROUND + "White Background");
        
        System.out.println(Color.BLACK_BRIGHT + "Black Bright");
        System.out.println(Color.RED_BRIGHT + "Red Bright");
        System.out.println(Color.GREEN_BRIGHT + "Green Bright");
        System.out.println(Color.YELLOW_BRIGHT + "Yellow Bright");
        System.out.println(Color.BLUE_BRIGHT + "Blue Bright");
        System.out.println(Color.MAGENTA_BRIGHT + "Magenta Bright");
        System.out.println(Color.CYAN_BRIGHT + "Cyan Bright");
        System.out.println(Color.WHITE_BRIGHT + "White Bright");
        
        System.out.println(Color.BLACK_BOLD_BRIGHT + "Black Bold Bright");
        System.out.println(Color.RED_BOLD_BRIGHT + "Red Bold Bright");
        System.out.println(Color.GREEN_BOLD_BRIGHT + "Green Bold Bright");
        System.out.println(Color.YELLOW_BOLD_BRIGHT + "Yellow Bold Bright");
        System.out.println(Color.BLUE_BOLD_BRIGHT + "Blue Bold Bright");
        System.out.println(Color.MAGENTA_BOLD_BRIGHT + "Magenta Bold Bright");
        System.out.println(Color.CYAN_BOLD_BRIGHT + "Cyan Bold Bright");
        System.out.println(Color.WHITE_BOLD_BRIGHT + "White Bold Bright");
        
        System.out.println(Color.BLACK_BACKGROUND_BRIGHT + "Black Background Bright");
        System.out.println(Color.RED_BACKGROUND_BRIGHT + "Red Background Bright");
        System.out.println(Color.GREEN_BACKGROUND_BRIGHT + "Green Background Bright");
        System.out.println(Color.YELLOW_BACKGROUND_BRIGHT + "Yellow Background Bright");
    }

}
