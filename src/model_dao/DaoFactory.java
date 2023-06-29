package model_dao;

import model_dao_impl.SellerDaoJDBC;

public class DaoFactory {
    
    public static SellerDao creatSellerDao()  {
        return new SellerDaoJDBC();
    }

}
