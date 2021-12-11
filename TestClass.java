import java.io.IOException;
import java.util.*;

enum LOAD_TYPE {
	HARDCODAT, KEYBOARD, FILE
}

enum DISPLAY_TYPE {
	CONSOLA, FISIER, GUI
}

public class TestClass {
	public static Student readStudentForm(String line) throws Exception {
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(",");
			ArrayList<String> properties = new ArrayList<String>();
			while (rowScanner.hasNext()) {
				properties.add(rowScanner.next());
			}
			return new Student(properties);
		}
	}

	public static void main(String[] args) throws IOException {
		Settings.initApplication();
		
		System.out.println(Settings.loadType);
		System.out.print(Settings.displayType);
		
		// IDataLoader dataLoader = Settings.loadType == LOAD_TYPE.HARDCODAT ? new HardcodatDataManager()
		// 		: new FileDataManager();
		// Profesor[] profesors = dataLoader.createProfesorData();
		// for (Profesor p : profesors) {
		// 	System.out.println(p);
		// }
	}
}
