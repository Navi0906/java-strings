public class ToggleCase {
    public static void main(String[] args) {
        String input = "Hello World! This is a Test String.";
        String toggled = toggleCase(input);
        System.out.println(input);
        System.out.println(toggled);
    }

    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c)); 
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c)); 
            } else {
                toggledString.append(c);
            }
        }

        return toggledString.toString();
    }
}