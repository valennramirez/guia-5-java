package uno;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private float peso;
    private float altura;
    private boolean pesoIdeal;
    private boolean mayorEdad;

    public Persona (){
        nombre="";
        edad=0;
        sexo="m";
        peso=0;
        altura=0;
        pesoIdeal=false;
        mayorEdad=false;
    }

    public Persona (String nombre, int edad, String dni, String sexo, float peso, float altura)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public void setPesoIdeal(boolean pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public int calcularIMC ()
    {
        int flag=0;
        float pesoIdeal=peso/(altura*2);

        if(pesoIdeal<20)
        {
            flag=-1;
        }
        else if(20<=pesoIdeal && pesoIdeal<=25)
        {
            flag=0;
        }
        else if(pesoIdeal>25)
        {
            flag=1;
        }
        return flag;
    }

    public boolean esMayorDeEdad ()
    {
        boolean flag=false;

        if (edad>=18)
        {
            flag=true;
        }

        return flag;
    }

    public String comprobarSexo ()
    {
        String flag="H";

        if(sexo.equals("M") || sexo.equals("H"))
        {
            flag="C";
        }

        return flag;
    }

    public String toString(){
        return "Nombre: " + nombre + "\" " +
                 "Edad: " + edad + "\"" +
                 "DNI: "+ dni + "\"" +
                 "Sexo: " + sexo +"\" " +
                "Peso: " + peso + "\"" +
                 "Altura: " + altura;
    }






}