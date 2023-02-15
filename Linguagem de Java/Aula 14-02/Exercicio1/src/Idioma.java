import java.util.Locale;
public class Idioma
{
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O seu sistema está em " + loc.getDisplayLanguage() + " - " + loc.getLanguage());

    }
}