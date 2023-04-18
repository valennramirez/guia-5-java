package Uno;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private float peso;
    private float altura;

    public Persona (){
        nombre="";
        edad=0;
        sexo="m";
        peso=0;
        altura=0;
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

    public float calcularIMC (float numPeso, float numAltura)
    {
        float flag=0;
        flag=numPeso/(numAltura*2);
        return flag;
    }

    public boolean esMayorDeEdad (int num)
    {
        boolean flag=false;

        if (num>=18)
        {
            flag=true;
        }

        return flag;
    }

    public String comprobarSexo (Persona aux)
    {
        String flag="h";

        if(aux.getSexo().equals("M") || aux.getSexo().equals("H"))
        {
            flag="c";
        }

        return flag;
    }

    public String toString(){
        return "Nombre: " + nombre + "Edad: " + edad + "DNI: "+ dni + "Sexo: " + sexo + "Peso: " + peso + "Altura: " + altura;
    }






}
