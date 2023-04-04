package Arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) throws IOException {
        //pega a pasta do usuário atual
        //um mesmo computador pode ter vários usuários
        String home = System.getProperty("user.home");

        //cria um arquivo dentro da pasta do usuário atual
        File file = new File(home + "/meuprograma.txt");

        //escreve algumas linhas
        //lembrar de colocar \n no final. é ela que marca o inicio de uma linha nova
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Line 1\n");
            fw.write("Hello World\n");
            fw.write("Line 2\n");
        }

        //a classe BufferedReader lê o conteudo da classe FileReader e nos
        //dá funções úteis, como ler uma linha toda: readLine
        //a classe FileReader provê poucas funções úteis
        //existem vários "Reader" por ai, cada um deles lê de uma
        //maneira diferente ou provê funções diferentes
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
