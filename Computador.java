import java.util.Scanner;

public class Computador {
    private static final double PRECO_PLACA_MAE = 1000.00;
    private static final double PRECO_PROCESSADOR_I3 = 400.00;
    private static final double PRECO_PROCESSADOR_I5 = 600.00;
    private static final double PRECO_PROCESSADOR_I7 = 800.00;
    private static final double PRECO_MEMORIA_4GB = 350.00;
    private static final double PRECO_MEMORIA_8GB = 650.00;
    private static final double PRECO_MEMORIA_16GB = 1200.00;
    private static final double PRECO_HD_500GB = 270.00;
    private static final double PRECO_HD_1TB = 500.00;
    private static final double PRECO_MONITOR_15POL = 320.00;
    private static final double PRECO_MONITOR_17POL = 520.00;

    private String processador;
    private String memoria;
    private String hd;
    private String monitor;

    public Computador(String processador, String memoria, String hd, String monitor) {
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
        this.monitor = monitor;
    }

    public double calcularPreco() {
        double precoTotal = PRECO_PLACA_MAE;

        if ("i3".equals(processador)) precoTotal += PRECO_PROCESSADOR_I3;
        else if ("i5".equals(processador)) precoTotal += PRECO_PROCESSADOR_I5;
        else if ("i7".equals(processador)) precoTotal += PRECO_PROCESSADOR_I7;
        else throw new IllegalArgumentException("Processador inválido");

        if ("4GB".equals(memoria)) precoTotal += PRECO_MEMORIA_4GB;
        else if ("8GB".equals(memoria)) precoTotal += PRECO_MEMORIA_8GB;
        else if ("16GB".equals(memoria)) precoTotal += PRECO_MEMORIA_16GB;
        else throw new IllegalArgumentException("Memória inválida");

        if ("500GB".equals(hd)) precoTotal += PRECO_HD_500GB;
        else if ("1TB".equals(hd)) precoTotal += PRECO_HD_1TB;
        else throw new IllegalArgumentException("HD inválido");

        if ("15 polegadas".equals(monitor)) precoTotal += PRECO_MONITOR_15POL;
        else if ("17 polegadas".equals(monitor)) precoTotal += PRECO_MONITOR_17POL;
        else throw new IllegalArgumentException("Monitor inválido");

        return precoTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha o processador (i3, i5, i7):");
        String processador = scanner.nextLine();
        
        System.out.println("Escolha a memória (4GB, 8GB, 16GB):");
        String memoria = scanner.nextLine();
        
        System.out.println("Escolha o HD (500GB, 1TB):");
        String hd = scanner.nextLine();
        
        System.out.println("Escolha o monitor (15 polegadas, 17 polegadas):");
        String monitor = scanner.nextLine();

        Computador meuComputador = new Computador(processador, memoria, hd, monitor);
        double precoFinal = meuComputador.calcularPreco();
        System.out.printf("O preço total do computador é: R$ %.2f%n", precoFinal);
        
        scanner.close();
    }
}

