package application;

//import java.util.Date;
import java.util.List;
import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;

public class Program {

    public static void main(String[] args) {

       

        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("==== TESTE 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== TESTE 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==== TESTE 3: seller findAll ====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        /*
         * System.out.println("\n==== TESTE 4:  Seller  insert ====");
         * Seller newSeller = new Seller(null, "Kaique", "kaique@gmail.com", new Date(),
         * 6000.0, department);
         * sellerDao.insert(newSeller);
         * System.out.println("Insertd! New id = " + newSeller.getId());
         */

        System.out.println("\n==== TESTE 5:  Seller  update ====");
        seller = sellerDao.findById(12);
        seller.setEmail("kaio@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n==== TESTE 6: Seller delete ====");
        sellerDao.deleteById(14);
        System.out.println("Delete completed");

      

    }

}
