public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nombreMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        nomMateria=nombreMateria;
    }
    
    public void inscribir(Estudiante e)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            estudiantes[0]= e;
        }
    }
    
    public void darBaja(int claveEstudiante)
    {
        
    }
}