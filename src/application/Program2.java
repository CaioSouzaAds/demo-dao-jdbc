package application;

import model_dao.DaoFactory;
import model_dao.DepartmentDao;
import model_entities.Department;

public class Program2 {
    
         public static void main(String[] args) {

            DepartmentDao deparmentDao = DaoFactory.creatDepartmentDao();
            Department department = new Department(null, "Engineering" );
            deparmentDao.insert(department);
            System.out.println("Department insert id: " + department.getId());


            
        }

}
