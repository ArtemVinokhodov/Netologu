package com.company.arraysOneDemensional;
import java.util.Scanner;

public class ArraysOneD {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] products = new String[]{"хлеб", "сыр", "колбоса", "молоко"};
    int[] prices = new int[]{5, 10, 20, 30};

    int productNumber = 0;
    int productCount = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + " " + products[i] + " " + prices[i] + " руб");
        }
        int sumProducts = 0;

        int[] basket = new int[products.length];

        while (true) {
            System.out.println("Введите номер товара и через пробел количество для добавления в корзину или введите `end` для завершения ");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");
            productNumber = Integer.parseInt(parts[0]) - 1; //номер продукта
            productCount = Integer.parseInt(parts[1]); //количество

            sumProducts = sumProducts + (prices[productNumber] * productCount);
            basket[productNumber] = basket[productNumber] + productCount;


        }
        for (int i = 0; i < products.length; i++) {
            if(basket[i] > 0){
                int priceOfProduct = basket[i] * prices[i];
                System.out.println("--------------------------");
                System.out.println("Ваша корзина: \nНаименование товара | Количество | Цена/за ед. | Общая стоимость");
                System.out.printf("%s %18s %16s %16s\n", products[i], basket[i], prices[i], priceOfProduct);
            }
        }
        System.out.println("--------------------");
        System.out.println("Общая сумма " + sumProducts);

    }
}



//    String[] parts = input.split(" ");
//                    productNumber = Integer.parseInt(parts[0]) - 1;
//                            productCount = Integer.parseInt(parts[1]);
//
//
//                            currentPrice = prices[productNumber];
//                            sumPrice = currentPrice * productCount;
//                            sumProducts = sumPrice;
//
//                            }


//                System.out.println("Ваша корзина: \nНаименование товара | Количество | Цена/за ед. | Общая стоимость");
//                        for (int i = 0; i < products.length; i++) {
//        System.out.println(products[productNumber] + "                    "
//        + productCount + "         "
//        + currentPrice + "           "
//        + sumPrice);
//        }
//        System.out.println("Итого: " + sumProducts);
//        }
//        }



//products[productNumber]




//            int[] temps = new int[31];
//            boolean[] isFilled = new boolean[31];
//
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                System.out.println("Введи число и темп: ");
//                String input = scanner.nextLine();
//                if ("end".equals(input)) break;

//                String[] parts = input.split(" ");
//                int day = Integer.parseInt(parts[0]) - 1;
//                int temp = Integer.parseInt(parts[1]);
//                temps[day] = temp;
//                isFilled[day] = true;
//
//                double sum = 0;
//                for (int t : temps) {
//                    sum += t;
//                }
//
//                int count = 0;
//                for (boolean filled : isFilled) {
//                    if (filled) count++;
//                }
//
//                System.out.println("Средняя темп: " + (sum / count) +
//                        " (на основе " + count + " дней)");
//            }
//
//            System.out.println("Пока!");
//        }
//
//
//}
