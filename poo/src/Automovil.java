public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    //Métodos getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico(){
        return Automovil.capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico){
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        if (tanque == null){
            this.tanque = new Tanque();
        }
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length){
            this.ruedas[this.indiceRuedas++] = rueda;
        }
        return this;
    }

    public String verDetalle(){
        String detalle = "auto.id = " + this.id
         + "\nauto.fabricante = " + this.getFabricante()
         + "\nauto.modelo = " + this.getModelo();

        if(this.getTipo() != null){
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }

         detalle += "\nauto.color = " + this.color
         + "\nauto.colorPatente = " + colorPatente;

        if(this.motor != null){
            detalle += "\nauto.motor = " + this.motor.getCilindrada();
        }

        if(conductor != null){
            detalle += "\nConductor: " + this.getConductor();
        }

        if(getRuedas() != null){
            detalle += "\nRueda del automóvil:";
            for(Rueda r: this.getRuedas()){
                detalle = detalle + ("\n" + this.getFabricante() + ", aro: " + r.getAro() + ", anch: " + r.getAncho());
            }
        }


        return detalle;
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenado!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;

    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.getTanque().getCapacidad()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.getTanque().getCapacidad()*(porcentajeBencina/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/(Automovil.capacidadTanqueEstatico * (porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){ //Si es el mismo objeto, retorna true
            return true;
        }

        if(!(obj instanceof  Automovil)){ //Si la instancia del objeto no es la misma que Automovil, retorna false
            return false;
        }
        Automovil a = (Automovil) obj;
        //Validamos que Fabricante y Modelo sean distintos de null
        return (this.fabricante != null && this.modelo != null
        && this.fabricante.equals(a.getFabricante())
        && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return fabricante.compareTo(a.fabricante);
    }
}
