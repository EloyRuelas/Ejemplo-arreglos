public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nombreMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        nomMateria=nombreMateria;
    }
    
    /**
     * Busca un espacio disponible en el arreglo
     * @return Regresa la primera posicion nula dentro del arreglo
     */
    private int buscaEspacioDisponible()
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i]==null)
            {
                return i;
            }
        }
        return -1;
    }
        
    /**
     * Inscribe un alumno nuevo en el grupo
     * @param e Es el objeto estudiante a insribir en el grupo.
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso 
     *          de que no se pudiera inscribir.
     *          
     */
    public boolean inscribir(Estudiante e)
    {
        int existe=this.buscarEstudiante(e.dimeClave());
        if(existe != -1)
        {
            return false; //el estudiante ya esta inscrito
        }
        
        int posDisponible=this.buscaEspacioDisponible();
        if(posDisponible==-1)
        {
            return false;   //El arreglo esta lleno
        }
        
        estudiantes[posDisponible]=e;       //inscribe al estudiante
        return true;        //el estudiante fue inscrito
    }
    
    /**
     * Da de baja a un alumno del grupo.
     * @param es el objeto estudiante a dar de baja.
     * @return regresa verdadero si se logro dar de baja, y false si no se encuentra el estudiante en el grupo.
     */
    public boolean darBaja(Estudiante e)
    {
        int existe=this.buscarEstudiante(e.dimeClave());
        if(existe!=1)
        {
            estudiantes[existe]=null;
            if(estudiantes[existe]==null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
        
    
    /**
     * Busca un estudiante por medio de su clave.
     * @param claveEstudiante Parametro que representa la clave del estudiante a buscar
     * @return Regresa la posicion del estudiante en el arreglo o -1 si no existe.
     */
    public int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0; i< estudiantes.length; i++)
        {
            if(estudiantes[i]!=null)
            {
                if(estudiantes[i].dimeClave()==claveEstudiante)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
}