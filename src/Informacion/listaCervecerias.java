package Informacion;


import java.io.*;
import java.util.ArrayList;
import org.apache.struts2.ServletActionContext;

public class listaCervecerias {

	private ArrayList<Cerveceria> lista;
	private Cerveceria cerv;

	public listaCervecerias()
	{
		lista=new ArrayList<Cerveceria>();	
		cerv=null;
		cargarCervezas();
	}
	
	public File[] listaArchivos()
	{
		//Lista los archivos .txt en el directorio indicado
		String ruta=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/WEB-INF/files/Archivos");
		File directorio=new File(ruta);
		File[] files=directorio.listFiles(new FilenameFilter() {
		    public boolean accept(File directorio, String name) {
		        return name.toLowerCase().endsWith(".txt");
		    }
		});
		return files;		
	}
	
	public void cargarCervezas()
	{
		//Crea tantas instancias de la clase Cerveza como archivos devuelva "listaArchivos". Asigna la info correspondiente a cada instancia y las agrega a la lista de cervezas.
		for(File archivo: listaArchivos())
		{
			//Creo la cerveza y llamo al metodo que inicializa los datos de la misma
			CargarDatosCerv(archivo);
			CargarImagenCerv(archivo);
			//Agrego cerveza al final de la lista de cervezas
			lista.add(cerv);
		}
	}
	
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
			//controla que este el archivo, sino cargar imagen predeterminada
			String ruta=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/");
			File af = new File(ruta+rutaImagen);
			if (!af.exists()) { 
				rutaImagen="img/not found.jpg";
			}
			cerv.setImagen(rutaImagen);
		}
		catch(Exception e) {}
		
	}
	
	private void CargarDatosCerv(File archivo)
	//Carga los datos de cada cerveza proveniente de los archivos. Cada cerveza tiene su archivo.
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
			cerv.setDesc(linea);
			linea=buffer.readLine();
			cerv.setPuntaje(Integer.parseInt(linea));
			buffer.close();
		}
		catch(Exception e) {}	
	}
	
	private String obtenerNombreCerv(File archivo)
	{
		//Obtiene el nombre del archivo sin extension para asignarlo a la cerveza
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
	
	public ArrayList<Cerveceria> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cerveceria> lista) {
		this.lista = lista;
	}

	public Cerveceria buscarCerveza(String nombreCerveceria) {
		//Crea tantas instancias de la clase Cerveza como archivos devuelva "listaArchivos". Asigna la info correspondiente a cada instancia y las agrega a la lista de cervezas.
		Cerveceria x=null;
		int i=0;
		while(!lista.isEmpty() && x==null) {
			if(lista.get(i).getNombre().equals(nombreCerveceria))
				x=lista.get(i);
			else
				i++;
		}
		return x;
	}

	public void modificarCerveceria(Cerveceria cerveceria) {
		//modifico cerveceria
		System.out.println("Modifico cerveceria : "+cerveceria.getNombre());
		
	}
	
	public void eliminarCerveceria(Cerveceria cerveceria) {
		//elimino cerveceria
		System.out.println("Elimino cerveceria : "+cerveceria.getNombre());
	}

	public void agregarCerveceria(Cerveceria cerveceria) {
		//agrego cerveceria
		System.out.println("Agrego cerveceria : "+cerveceria.getNombre());
		
	}
	
	//Desde aca lo nuevo!!!!!
		//Cambiar los nombres de los metodos
		
		
		/*
		 * Crea un nuevo archivo con los datos de la cerveza pasada por parametro
		 */
	public void nuevaCerv(Cerveceria cerv)
	{
		File archivoNuevo=new File (cerv.getNombre()+".txt");
		try {
			FileWriter escritor=new FileWriter(archivoNuevo,true);
			escritor.write(cerv.getDireccion());
			escritor.write("\n"+cerv.getMejorVariedad());
			escritor.write("\n"+cerv.getPuntaje());
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
		//VER RUTA
		
		/*
		 * Reemplaza el archivo anterior de la cerveza por uno nuevo. 
		 * De ser un archivo muy grande se podria solo modificar la/s lineas que correspondan
		 */
	public void reemplazarCerv(Cerveceria cerv)
	{
		String ruta=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/WEB-INF/files/Archivos");
		File archivoEliminar= new File(ruta+"/"+cerv.getNombre()+".txt");
		archivoEliminar.delete();
		nuevaCerv(cerv);
	}

}

