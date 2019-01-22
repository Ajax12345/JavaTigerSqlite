
import dbUtilities.*;

import java.util.HashMap;

public class test_sql_apis extends SQLDriver{
    public static void main(String [] args) throws Exception{
        SQLDriver driver = new SQLDriver();
        //driver._create_db;
        String [] columns = {"name", "age", "address"};
        DBTypes [] full_types = {new DBTypes("text"), new DBTypes("real"), new DBTypes("text")};
        //driver.create_table("testtable", "first_test_db.db", columns, full_types);
        DBValue [] all_vals = {new DBValue<String>("James"), new DBValue<Integer>(1), new DBValue<String>("5th Ave. NYC")};
        //driver.insert_vals("testtable", "first_test_db.db", all_vals);
        int count = 1;
        for (HashMap<String, ReturnedValue> val: driver.select_all("first_test_db.db", "testtable")){
            System.out.print("row ");
            System.out.println(count);
            count++;
            System.out.println(val.get("age").to_double());
            System.out.println(val.get("address").to_string());
            System.out.println(val.get("name").to_string());

        }
    }
}

