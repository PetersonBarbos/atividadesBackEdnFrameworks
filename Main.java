public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        System.out.printf("%s %s\n",p1.nome,p1.sobrenome);
        System.out.printf("%s - %s - %s\n",p1.email,p1.dataDeNascimento,p1.telefone);
        System.out.println(p1.paisDeNacionalidade);
    }
}
