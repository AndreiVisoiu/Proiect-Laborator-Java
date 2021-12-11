public class FileDataManager implements IDataLoader{
    @Override
    public Student[] createStudentsData() {
        // Settings.STUDENTS_PATH;
        return new Student[0];
    }

    @Override
    public Profesor[] createProfesorData() {
        // Settings.TEACHERS_PATH;
        return new Profesor[0];
    }

    @Override
    public Curs[] createCoursesData() {
        // Settings.COURSES_PATH;
        return new Curs[0];
    }
}
