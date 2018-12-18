import javax.swing.JOptionPane;
class vendas2
{
    public static void main(String args[])
    {
        float salario_fixo, quantidade, comissao, salario_total;

        salario_fixo = 500;
        quantidade = Float.parseFloat(
        JOptionPane.showInputDialog("Quantidade de sistemas vendidos: "));
        comissao = quantidade * 50;
        salario_total = salario_fixo + comissao;

        JOptionPane.showMessageDialog(null,"Salário fixo: "+salario_fixo+
        "\nQuantidade de sistemas vendidos: "+quantidade+
        "\nComissão: "+comissao+
        "\nSalario_total: "+salario_total);

        System.out.println("Salário fixo: "+salario_fixo);
        System.out.println("Quantidade de sistemas vendidos: "+quantidade);
        System.out.println("Comissão: "+comissao);
        System.out.println("Salario_total: "+salario_total);

    }
}