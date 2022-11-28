package com.java.homework.homework11;
import java.io.*;
import java.util.*;

public class Runner {
    List<Product> productList = new ArrayList<>();
    List<Order> orderList = new ArrayList<>();

    public void runProgram() {

        createProductList();
        createOrderList();
        System.out.println("Добро пожаловать в меню!");
        String[] menuOption = {
                "1 - Вывести список товаров на экран;",
                "2- Добавить товар;",
                "3- Удалить товар;",
                "4- Вывести список заказов на экран;",
                "5- Добавить заказ;",
                "6- Удалить заказ;",
                "7- Выход из приложения;"};

        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 7) {
            printMenu(menuOption);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        option1PrintProductList();
                        break;
                    case 2:
                        option2AddProductToList();
                        break;
                    case 3:
                        option3DeleteProductFromList();
                        break;
                    case 4:
                        option4PrintOrderList();
                        break;
                    case 5:
                        option5AddOrderToList();
                        break;
                    case 6:
                        option6DeleteOrderFromList();
                        break;
                    case 7:
                        System.exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + menuOption.length);
                scanner.next();
            }
        }
    }

    private void createOrderList() {
        orderList.add(new Order("Вася Пупкин", "яблоко", 10));
        orderList.add(new Order("Маша Долина", "киви", 5));
        orderList.add(new Order("Семён Зайцев", "капуста", 10));
        try (FileWriter fw = new FileWriter("resources/orders.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (Order order : orderList) {
                String name = order.getClientName();
                String productName = order.getProductName();
                int productAmount = order.getAmount();
                Date date = order.getDateCreated();
                String id = order.getOrderID();
                fw.write("Имя покупателя: " + name + ", наименование заказываемого товара: " + productName +
                        ". Колличество товара: " + productAmount + ". Дата оформления заказа: " + date +
                        ", идентификатор: " + id + System.getProperty("line.separator") + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createProductList() {
        productList.add(new Product("яблоко"));
        productList.add(new Product("банан"));
        productList.add(new Product("киви"));
        try (FileWriter fw = new FileWriter("resources/products.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (Product product : productList) {
                String name = product.getName();
                Date data = product.getDateCreated();
                String id = product.getUniqueID();
                fw.write("Продукт: " + name + ". Дата изготовления: " + data +
                        ", идентификатор: " + id + System.getProperty("line.separator") + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Выберите пункт меню: ");
    }

    private void option1PrintProductList() {
        System.out.println("Thanks for choosing option 1");
        productList.forEach(System.out::println);
        productFileChange();
    }

    private void option2AddProductToList() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите название продукта: ");
        String productName = scanner1.nextLine();
        productList.add(new Product(productName));
        productFileChange();
    }

    private void option3DeleteProductFromList() {
        System.out.println("Введите название продукта для дальнейшего удаления: ");
        Scanner scanner2 = new Scanner(System.in);
        String productNameDelete = scanner2.nextLine();
        productList.removeIf(nextProduct -> nextProduct.getName().equals(productNameDelete));
        productFileChange();
    }

    private void option4PrintOrderList() {
        orderList.forEach(System.out::println);
        orderFileChange();
    }

    private void option5AddOrderToList() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите свою фамилию и имя: ");
        String userName = scanner1.nextLine();
        System.out.println("Введите желаемый товар");
        String productName = scanner1.nextLine();
        System.out.println("Введите колличество товара");
        int productAmount = scanner1.nextInt();
        orderList.add(new Order(userName, productName, productAmount));
        orderFileChange();
    }

    private void option6DeleteOrderFromList() {
        System.out.println("Введите номер заказа для дальнейшего удаления: ");
        Scanner scanner2 = new Scanner(System.in);
        String orderIDInput = scanner2.nextLine();
        orderList.removeIf(nextOrder -> nextOrder.getOrderID().equals(orderIDInput));
        orderFileChange();
    }

    private void productFileChange() {
        try (FileWriter fw = new FileWriter("resources/products.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (Product product : productList) {
                String name = product.getName();
                Date data = product.getDateCreated();
                String id = product.getUniqueID();
                fw.write("Продукт: " + name + ". Дата изготовления: " + data +
                        ", идентификатор: " + id + System.getProperty("line.separator") + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void orderFileChange() {
        try (FileWriter fw = new FileWriter("resources/orders.txt", false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (Order order : orderList) {
                String name = order.getClientName();
                String productName = order.getProductName();
                int productAmount = order.getAmount();
                Date date = order.getDateCreated();
                String id = order.getOrderID();
                fw.write("Имя покупателя: " + name + ", наименование заказываемого товара: " + productName +
                        ". Колличество товара: " + productAmount + ". Дата оформления заказа: " + date +
                        ", идентификатор: " + id + System.getProperty("line.separator") + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}









