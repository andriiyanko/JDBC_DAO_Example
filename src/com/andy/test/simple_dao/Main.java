package com.andy.test.simple_dao;

import com.andy.test.simple_dao.dao.CarDAO;
import com.andy.test.simple_dao.dao.DAOFactory;
import com.andy.test.simple_dao.dao.IDAOFactory;


public class Main {

    public static void main(String[] args) {
        IDAOFactory factory = DAOFactory.getInstance();
        CarDAO carDAO = factory.getCarDAO();

        carDAO.remove("Chevrolet");

//        System.out.println(car.getId() + " " + car.getMark()
//                    + " " + car.getModel() + " " + car.getPrice());

    }

}
