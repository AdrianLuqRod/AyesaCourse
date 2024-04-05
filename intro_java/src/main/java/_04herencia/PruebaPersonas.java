package _04herencia;

public class PruebaPersonas {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        Profesor profesor = new Profesor(2000, alumnos);
        profesor.setNombre("Juan");
        Alumno alumno = new Alumno("1123", profesor);
        alumno.setNombre("Pedro");
        Alumno alumno2 = new Alumno("1223", profesor);
        alumno2.setNombre("Mar");
        Alumno alumno3 = new Alumno("1233", profesor);
        alumno3.setNombre("Adri");

        alumnos[0] = alumno;
        alumnos[1] = alumno2;
        alumnos[2] = alumno3;

        imprimeAlumno(alumno);
        System.out.println("--------------------");
        imprimeProfesor(profesor);
    }

    public static void imprimeAlumno(Alumno alumno) {
        System.out.println(alumno);
    }

    public static void imprimeProfesor(Profesor profesor) {
        System.out.println(profesor);
    }
}
