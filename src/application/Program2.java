package application;

import java.util.List;

import model_dao.DaoFactory;
import model_dao.DepartmentDao;
import model_entities.Department;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

        System.out.println(("\n==== TESTE 1:  Department  insert ===="));
        Department department = new Department(null, "Engineering");
        departmentDao.insert(department);
        System.out.println("Department insert id: " + department.getId());

        System.out.println(("\n==== TESTE 2:   Department SelectById ===="));
        department = departmentDao.findById(8);
        System.out.println(department);

        System.out.println(("\n==== TESTE 3:   Department Update ===="));
        department = departmentDao.findById(8);
        department.setName("Car workshop");
        departmentDao.update(department);
        System.out.println("Success Update");

        System.out.println("\n==== TESTE 4: Department delete ====");
        departmentDao.deleteById(7);
        System.out.println("Delete completed");

        System.out.println("\n=== TEST 2: findAll =======");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }
    }

}
