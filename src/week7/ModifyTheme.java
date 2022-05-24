package week7;

public class ModifyTheme extends Theme {
    public static void main(String[] args) {
        ModifyTheme mt = new ModifyTheme();
        mt.displayColors();
        System.out.println(mt.getBgColor());
        System.out.println(mt.getForegroundColor());
        System.out.println(mt.getTextColor());
    }

    @Override
    public void displayColors() {
        super.displayColors();
        setBgColor("Orange");
    }
}
