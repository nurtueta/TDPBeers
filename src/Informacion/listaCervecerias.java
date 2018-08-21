package Informacion;


import java.io.*;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;

/**
 * Clase encargada de la logica de la lista de cervecerias. Creacion, asignacion de atributos, agregacion, elimininacion y modificacion de las cervecerias.
 * @author Urtueta, Nahuel
 * @author Volpe, Leandro
 */
public class listaCervecerias {

	private ArrayList<Cerveceria> lista;
	private Cerveceria cerv;

	public listaCervecerias()
	{
		lista=new ArrayList<Cerveceria>();	
		cerv=null;
		cargarCervezas();
	}
	
	/**
	 * Lista los archivos .txt en el directorio indicado
	 * @return
	 */
	public File[] listaArchivos()
	{
		//String ruta=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/WEB-INF/files/Archivos");
		String ruta="/home/nahuel/Documentos/TDPBeers/WebContent/WEB-INF/files/Archivos";
		File directorio=new File(ruta);
		File[] files=directorio.listFiles(new FilenameFilter() {
		    public boolean accept(File directorio, String name) {
		        return name.toLowerCase().endsWith(".txt");
		    }
		});
		return files;
	}
	
	/**
	 * Crea tantas instancias de la clase Cerveza como archivos devuelva "listaArchivos". 
	 * Asigna la info correspondiente a cada instancia y las agrega a la lista de cervezas.
	 */
	public void cargarCervezas()
	{
		for(File archivo: listaArchivos())
		{
			CargarDatosCerv(archivo);
			CargarImagenCerv(archivo);
			lista.add(cerv);
		}
	}
	
	/**
	 * Carga la imagen en el atributo de la cerveceria. En caso de no existir imagen para la cerveceria, cagar una imagen por defecto.
	 * @param archivo de tipo File
	 */
	private void CargarImagenCerv(File archivo)
	{	
		try
		{	
			String rutaImagen="img/";
			int i=archivo.getName().length();
			for(int j=0;j<(i-3);j++)
			{
				rutaImagen+=archivo.getName().charAt(j);
			}
			rutaImagen+="jpg";
			
			String ruta="/home/nahuel/Documentos/TDPBeers/WebContent/";
			File af = new File(ruta+rutaImagen);
			if (!af.exists()) { 
				rutaImagen="img/not found.jpg";
			}
			cerv.setImagen(rutaImagen);
		}
		catch(Exception e) {}
	}
	
	/**
	 * Carga los datos de cada cerveza proveniente de los archivos. Cada cerveza tiene su archivo.
	 * @param archivo de tipo File
	 */
	private void CargarDatosCerv(File archivo)
	{
		try
		{
			cerv=new Cerveceria();
			String linea="";
			cerv.setNombre(obtenerNombreCerv(archivo));
			BufferedReader buffer = new BufferedReader(new FileReader(archivo.toString()));
			linea=buffer.readLine();
			cerv.setDireccion(linea);
			linea=buffer.readLine();
			cerv.setMejorVariedad(linea);
			linea=buffer.readLine();
			cerv.setPuntaje(Integer.parseInt(linea));
			buffer.close();
		}
		catch(Exception e) {}	
	}
	
	/**
	 * Obtiene el nombre del archivo sin extension para asignarlo a la cerveza
	 * @param archivo de tipo File
	 * @return nombre de la cerveceria, de tipo String
	 */
	private String obtenerNombreCerv(File archivo)
	{
		String nombre,temp;
		int i=0;
		nombre="";
		temp=archivo.getName();
		while((temp.charAt(i)!='.'))
		{
			nombre+=temp.charAt(i);
			i++;
		}
		return nombre;	
	}
	
	/**
	 * Busca la cerveceria pasada por parametro en la lis
	 * @param nombreCerveceria
	 * @return c de tipo Cerveceria
	 */
	public Cerveceria buscarCerveza(String nombreCerveceria) {
		Cerveceria c=null;
		int i=0;
		while(!lista.isEmpty() && c==null) {
			if(lista.get(i).getNombre().equals(nombreCerveceria))
				c=lista.get(i);
			else
				i++;
		}
		return c;
	}	
	
	/**
	 * Crea un nuevo archivo con los datos de la cerveza pasada por parametro
	 * @param cerv de tipo Cerveceria
	 */
	public void agregarCerveceria(Cerveceria cerv)
	{
		cargarTexto(cerv);
		if(cerv.getArchivoImagen()!=null)
			cargarImagen(cerv);
	}

	private void cargarTexto(Cerveceria cerv) {
		String ruta="/home/nahuel/Documentos/TDPBeers/WebContent/WEB-INF/files/Archivos/"+cerv.getNombre()+".txt";
		File archivoNuevo= new File(ruta);
		try {
			FileWriter escritor=new FileWriter(archivoNuevo,true);
			escritor.write(cerv.getDireccion());
			escritor.write("\n"+cerv.getMejorVariedad());
			escritor.write("\n"+cerv.getPuntaje());
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void cargarImagen(Cerveceria cerv) {
		String rutaImagen="/home/nahuel/Documentos/TDPBeers/WebContent/img/";
		try {
	     	 File destFile  = new File(rutaImagen, cerv.getNombre()+".jpg");
	         FileUtils.copyFile(cerv.getArchivoImagen(), destFile);
	  
	      } catch(IOException e) {
	         e.printStackTrace();
	         System.out.println("Error al copiar archivo");
	      }
	}
	
	/**
	 * Reemplaza el archivo anterior de la cerveza por uno nuevo. 
	 * De ser un archivo muy grande se podria solo modificar la/s lineas que correspondan
	 * @param cerv de tipo Cerveceria
	 */
	public void modificarCerveceria(Cerveceria cerv)
	{
		String ruta="/home/nahuel/Documentos/TDPBeers/WebContent/WEB-INF/files/Archivos/"+cerv.getNombre()+".txt";
		File archivoEliminar= new File(ruta);
		archivoEliminar.delete();
		cargarTexto(cerv);
	}
	
	/**
	 * Elimina el archivo correspondiente a la cerveceria pasada por parametro 
	 * @param cerv de tipo Cerveceria
	 */
	public void eliminarCerveceria(Cerveceria cerv) 
	{
		String ruta="/home/nahuel/Documentos/TDPBeers/WebContent/WEB-INF/files/Archivos/"+cerv.getNombre()+".txt";
		File archivoEliminar= new File(ruta);
		archivoEliminar.delete();
	}
	
	public ArrayList<Cerveceria> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cerveceria> lista) {
		this.lista = lista;
	}
}

