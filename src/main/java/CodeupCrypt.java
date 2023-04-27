public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String str) {
        StringBuilder hash = new StringBuilder();
        for (char character : str.toCharArray()) {
            switch (character) {
                case 'a', 'A' -> hash.append(4);
                case 'e', 'E' -> hash.append(3);
                case 'i', 'I' -> hash.append(1);
                case 'o', 'O' -> hash.append(0);
                case 'u', 'U' -> hash.append(9);
                default -> hash.append(character);
            }
        }
        return hash.toString();
    }

    public static boolean checkPassword(String pass, String hash) {
        return hash.equals(hashPassword(pass));
    }

}
