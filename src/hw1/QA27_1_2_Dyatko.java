package hw1;

public class QA27_1_2_Dyatko {

    public static void main(String[] args) {
        int gpuToProduce = 450;
        double averagePrice = 666.66;
        double averageTaxProcent = 10.2;

        System.out.println("Созданная партия видеокарт: " + gpuToProduce);
        System.out.println("Выручка полученная с продажи : " + averagePrice);
        System.out.println("Количество денег после вычета налогов : " +(averagePrice - (averagePrice/averageTaxProcent)));

         gpuToProduce += 16;
         averagePrice += 754.37;
         averageTaxProcent -= 1;

        System.out.println("Усиленная партия видеокарт: " + gpuToProduce);
        System.out.println("Увеличенная выручка полученная с продажи: " + averagePrice);
        System.out.println("Количество денег с двойной смены после вычета налогов: " + (averagePrice - (averagePrice/averageTaxProcent)));


    }
}
