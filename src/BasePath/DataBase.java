package BasePath;

public class DataBase {
    public static String dataBase() {

        String nome = "Joana Santos";
        String contaBancaria = "Corrente";

       return("Nome do Cliente - "+nome+"\nTipo de Conta - "+contaBancaria);
    }
    public static String separador(){
        return "****************************";
    }
    public static String showOptions(){

        return """
                1 - Consultar Saldo
                2 - Transferir Saldo
                3 - Receber Valor
                4 - Sair
                """;
    }




}
