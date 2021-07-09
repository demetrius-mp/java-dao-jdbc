package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===Teste 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n===Teste 2: seller findByDepartment ===");
        List<Seller> list = sellerDao.findByDepartment(2);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n===Teste 3: seller findAll ===");
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
