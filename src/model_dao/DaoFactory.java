package model_dao;

import db.DB;
import model_dao_impl.SellerDaoJDBC;

public class DaoFactory {
    
    public static SellerDao creatSellerDao()  {
        return new SellerDaoJDBC(DB.getConnection());
    }

}
