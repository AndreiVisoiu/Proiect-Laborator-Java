import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
// import java.io.FileNotFoundException;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.Scanner;

public class Settings {
    public static String STUDENTS_PATH = "studenti.csv";
    public static String TEACHERS_PATH = "profesori.csv";
    public static String COURSES_PATH = "cursuri.csv";
    public static LOAD_TYPE loadType = LOAD_TYPE.FILE;
    public static DISPLAY_TYPE displayType = DISPLAY_TYPE.CONSOLA;
    
    public static void initApplication() throws IOException {
        // Citire din fisier
        HashMap<String, String> HashMapsettings = new HashMap<String, String>();
        BufferedReader buffer = null;

        try {
            File file = new File("settings.txt");
            buffer = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = buffer.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0].trim();
                String setting = parts[2].trim();

                if(name.equals("LOAD_TYPE") || name.equals("DISPLAY_TYPE"))
                    {
                        setting = setting.substring(1, setting.length() - 1);
                    }

                if (!name.equals("") && !setting.equals(""))
                    HashMapsettings.put(name, setting);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (buffer != null)
                try {
                    buffer.close();
                } catch (Exception e) {
                }
            ;
        }

        // Initializare setari
        STUDENTS_PATH = HashMapsettings.get("STUDENTS_PATH");
        TEACHERS_PATH = HashMapsettings.get("TEACHERS_PATH");
        COURSES_PATH = HashMapsettings.get("COURSES_PATH");
        switch (HashMapsettings.get("LOAD_TYPE")) {
            case "HARDCODAT":
                loadType = LOAD_TYPE.HARDCODAT;
                break;
            case "KEYBOARD":
                loadType = LOAD_TYPE.KEYBOARD;
                break;
            case "FILE":
                loadType = LOAD_TYPE.FILE;
                break;
            default:
                break;
        }
        switch (HashMapsettings.get("DISPLAY_TYPE")) {
            case "CONSOLA":
                displayType = DISPLAY_TYPE.CONSOLA;
                break;
            case "FISIER":
                displayType = DISPLAY_TYPE.FISIER;
                break;
            case "GUI":
                displayType = DISPLAY_TYPE.GUI;
                break;
            default:
                break;
        }

    }
}
