
import utfpr_prog2_pratica.Azero;
import utfpr_prog2_pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * por Tomás Abril
 */
public class Main
{
    public static void main(String[] args) 
    {
        try {
            Equacao2Grau a = new Equacao2Grau(0, 2, 3); }
        catch (Azero e) {
            System.out.println(e); }
        Equacao2Grau b = new Equacao2Grau(5, 1, 6);
        
    }
}
