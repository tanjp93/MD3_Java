package Exam_Advance_1.ra.bussiness;

import Exam_Advance_1.ra.bussinessImp.Product;

public interface IShop {
    float RATE = 1.3F;

    void inputData();

    void displayData();

    int compareTo(Product o1, Product o2);
}
