package com.furniture;

public class FurnitureImpl {
    public static void main(String[] args) {
        FurnitureItem f1= new FurnitureItem();
        f1.setFurnitureCode(101);
        f1.setFurnitureType("Table");
        f1.setGradeOfFurniture("grade1");
        f1.setFurnitureUsage("Outdoor");
        f1.setPrice(10);

        System.out.print("furnitureCode= " + f1.getFurnitureCode()+",");
        System.out.print("furnitureType= " + f1.getFurnitureType()+",");
        System.out.print("gradeOfFurniture= " + f1.getGradeOfFurniture()+",");
        System.out.print("furnitureUsage= "  + f1.getFurnitureUsage()+",");
        System.out.println("price= " + f1.getPrice());
        float disc= f1.calculateDiscount();
        System.out.println("\n Discounted price is $" + disc);


    }
}
