import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try{
            if(System.getProperty("os.name").toLowerCase().contains("Windows")){
                proceso = rt.exec("notepad");
            }else if(System.getProperty("os.name").toLowerCase().contains("Mac")){
                proceso = rt.exec("textedit");
            }else if(System.getProperty("os.name").toLowerCase().contains("Nux") || System.getProperty("os.name").toLowerCase().contains("Nix")){
                proceso = rt.exec("textedit");
            }else{
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }catch (IOException | InterruptedException e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor.");
        System.exit(0);

    }
}
