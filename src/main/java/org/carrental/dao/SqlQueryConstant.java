package org.carrental.dao;

public class SqlQueryConstant {

    public final static String GET_ALL_CUSTOMER = "select * from customer";
    public final static String GET_CUSTOMER_BY_ID = "select * from customer where id = ?";
    public final static String GET_CUSTOMER_BY_NAME = "select * from customer where c_name like %?% ";
    public final static String UPDATE_CUSTOMER_BY_ID = "update customer set c_name = ? where id = ?";
    public final static String DELETE_CUSTOMER_BY_ID = "delete from customer where id = ?";
    public final static String INSERT_INTO_CUSTOMER =
            "insert into customer(c_name,phone_number,cnic,address,ref_phone_number)" +
            " values (?,?,?,?,?)";

    //user

    public final static String GET_USER_BY_USERNAME_AND_PASSWORD = "select * from user where username = ? AND pass = ? ";

}
