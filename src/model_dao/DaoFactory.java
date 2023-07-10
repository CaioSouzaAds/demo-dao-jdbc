package model_dao;

import db.DB;
import model_dao_impl.DepartmentDaoJDBC;
import model_dao_impl.SellerDaoJDBC;

public class DaoFactory {
    
    public static SellerDao creatSellerDao()  {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao creatDepartmentDao()  {
        return new DepartmentDaoJDBC(DB.getConnection());
    }

}
