public class Cliente {
    public static void main(String[] args) {
        String salaryRecords = "Essa é uma mensagem secreta: Aula até às 18h";
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        plain.writeData(salaryRecords);                        
        System.out.println("- Plain --------------");
        System.out.println(plain.readData());

        // DataSourceDecorator encoded = new CompressionDecorator(
        //                                  new EncryptionDecorator(
        //                                      new FileDataSource("out/OutputDemo.txt")));
        // encoded.writeData(salaryRecords);        

        // System.out.println("- Decoded --------------");
        // System.out.println(encoded.readData());
    }
}