package week7;

public class Theme {
    private String bgColor;
    private String foregroundColor;
    private String textColor;

    public Theme() {
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public void displayColors() {
        bgColor = "Red";
        foregroundColor = "Green";
        textColor = "Blue";
    }
}
