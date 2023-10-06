import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import model.Categoria;
import model.Produto;

public class GerenciarProduto {
    public GerenciarProduto() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Produto> lista = new ArrayList();
        System.out.println("Quantos tipos de produto deseja cadastrar?");
        int qtdProdutoCadastro = Integer.parseInt(scan.nextLine());

        int count;
        Produto saldo;
        for(count = 0; count < qtdProdutoCadastro; ++count) {
            System.out.println("Digite o codigo da categoria do produto " + (count + 1));
            int codCate = Integer.parseInt(scan.nextLine());
            System.out.println("Digite o nome da categoria do produto " + (count + 1));
            String nomeCate = scan.nextLine();
            System.out.println("Digite o codigo do produto " + (count + 1));
            int codProd = Integer.parseInt(scan.nextLine());
            System.out.println("Digite o nome do produto " + (count + 1));
            String nomeProd = scan.nextLine();
            System.out.println("Digite o preço do produto " + (count + 1));
            double precoProd = Double.parseDouble(scan.nextLine());
            System.out.println("Digite a quantidade do produto " + (count + 1));
            int qtdProd = Integer.parseInt(scan.nextLine());
            Categoria categoria1 = new Categoria(codCate, nomeCate);
            saldo = new Produto(codProd, nomeProd, precoProd, qtdProd, categoria1);
            lista.add(saldo);
            System.out.println("Se quiser adicionar mais desse produto no estoque, digite a quantidade do produto, se não quiser adicionar basta digitar 0. Produto: " + (count + 1));
            int addP = Integer.parseInt(scan.nextLine());
            saldo.entradaEstoque(addP);
            System.out.println("Se quiser remover uma quantidade desse produto do estoque, digite a quantidade do produto, se não quiser remover basta digitar 0. Produto: " + (count + 1));
            int delP = Integer.parseInt(scan.nextLine());
            saldo.saidaEstoque(delP);
        }

        System.out.println("Saída dos produtos adicionados na lista: ");
        System.out.println(lista);
        System.out.println();
        System.out.println("Saída apenas do status da quantidade de cada produto: ");
        count = 1;
        Iterator var20 = lista.iterator();

        int var10001;
        while(var20.hasNext()) {
            saldo = (Produto)var20.next();
            var10001 = count++;
            System.out.println("A quantidade em estoque do produto " + var10001 + " :" + saldo.getNome() + " é: " + saldo.getQuantidade());
        }

        boolean menu = true;

        while(menu) {
            System.out.println();
            System.out.println("Se deseja adicionar produtos no estoque - Digite 1. Se deseja remover produtos do estoque - Digite 2. Para sair digite 0 ");
            int add = Integer.parseInt(scan.nextLine());
            if (add == 0) {
                menu = false;
            }

            int count1;
            PrintStream var10000;
            Iterator var17;
            int qtdP;
            int produto;
            if (add == 1) {
                count1 = 1;
                System.out.println("Segue abaixo a lista de todos os produtos cadastrados: ");
                var17 = lista.iterator();

                while(var17.hasNext()) {
                    saldo = (Produto)var17.next();
                    var10000 = System.out;
                    var10001 = saldo.getQuantidade();
                    var10000.println("Contém: " + var10001 + " unidades do produto: " + saldo.getNome() + " no estoque. O número desse produto é: " + count1++);
                }

                System.out.println("Qual produto deseja adicionar no estoque? Selecione pelo número do produto: ");
                produto = Integer.parseInt(scan.next());
                saldo = (Produto)lista.get(produto - 1);
                System.out.println("Qual quantidade de " + saldo.getNome() + " deseja add no estoque? ");
                qtdP = Integer.parseInt(scan.next());
                saldo.entradaEstoque(qtdP);
            }

            if (add == 2) {
                count1 = 1;
                System.out.println("Segue abaixo a lista de todos os produtos cadastrados: ");
                var17 = lista.iterator();

                while(var17.hasNext()) {
                    saldo = (Produto)var17.next();
                    var10000 = System.out;
                    var10001 = saldo.getQuantidade();
                    var10000.println("Contém: " + var10001 + " unidades do produto: " + saldo.getNome() + " no estoque. O número desse produto é: " + count1++);
                }

                System.out.println("Qual produto deseja remover no estoque? Selecione pelo número do produto: ");
                produto = Integer.parseInt(scan.next());
                saldo = (Produto)lista.get(produto - 1);
                System.out.println("Qual quantidade de " + saldo.getNome() + " deseja remover do estoque? ");
                qtdP = Integer.parseInt(scan.next());
                saldo.saidaEstoque(qtdP);
            }

            System.out.println("Lista atualizada de produtos: ");
            count1 = 1;
            var17 = lista.iterator();

            while(var17.hasNext()) {
                saldo = (Produto)var17.next();
                var10001 = count1++;
                System.out.println("A quantidade em estoque do produto " + var10001 + " - " + saldo.getNome() + " é: " + saldo.getQuantidade());
            }
        }

    }
}