package Paulo.exercises;

public class Main {

    public static void main(String[] args) {
//	NumberInWord exercicio;
//        exercicio = new NumberInWord();
//        exercicio.print();
//       NumOfDays dias;
//       dias = new NumOfDays();
//        System.out.println(dias.getDaysInMonth(2, 2019));
//        SumOdd soma;
//        soma = new SumOdd();
//        System.out.println(soma.sumOdd(1,100));
//        NumberPalindrome numero;
//        numero = new NumberPalindrome();
//        System.out.println("O número -1221 " + numero.isPalindrome(-1221));
//        FirstLastSum soma;
//        soma = new FirstLastSum();
//        System.out.println("Soma do 1º e último de 134568 é " + soma.sumFirstAndLastDigit(14908));
//        NumberToWords num;
//        num = new NumberToWords();
//        num.numberToWords(100);
//        FlourPacker flour = new FlourPacker();
//        System.out.println(flour.canPack(2,10,18));
//        LargestPrime prime = new LargestPrime();
//        System.out.println(prime.getLargestPrime(45));
//        StarsSquares square = new StarsSquares();
//        square.printSquareStar(5);
//        ReadinUserInput input = new ReadinUserInput();
//        input.function();
        Bank banco = new Bank();
        banco.depositFund(300);
        banco.depositFund(300);
        banco.withdrawFunds(200);
        banco.withdrawFunds(500);
        banco.withdrawFunds(400);
    }
}
